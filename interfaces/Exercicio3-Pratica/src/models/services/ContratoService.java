package models.services;

import models.entities.Contrato;
import models.entities.Parcelas;

import java.time.LocalDate;


public class ContratoService  {

    private OnlinePaymentService onlinePaymentService;

    public ContratoService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processarContrato(Contrato contrato, Integer months){

        double valorParcelaSemJuros = contrato.getValorTotal() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dataVencimento = contrato.getData().plusMonths(i);
            double juros = onlinePaymentService.interest(valorParcelaSemJuros, i);
            double taxa = onlinePaymentService.paymentFee(valorParcelaSemJuros + juros);
            double valorParcelaComJuros = valorParcelaSemJuros + juros + taxa;

            contrato.getParcelas().add(new Parcelas(dataVencimento, valorParcelaComJuros));




        }

    }
}

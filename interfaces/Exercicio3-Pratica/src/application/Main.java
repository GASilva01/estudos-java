package application;

import models.entities.Contrato;
import models.entities.Parcelas;
import models.services.ContratoService;
import models.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número do contrato: ");
        int numeroContrato = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate dataContrato = LocalDate.parse(sc.next(), formatter);
        System.out.printf("Valor do contrato '%d': ", numeroContrato);
        double valorContrato = sc.nextDouble();
        Contrato contrato = new Contrato(numeroContrato, dataContrato, valorContrato);

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = sc.nextInt();
        ContratoService service = new ContratoService(new PaypalService());

        service.processarContrato(contrato, numeroParcelas);

        System.out.println("Parcelas: ");
        for (Parcelas parcelas: contrato.getParcelas()){
            System.out.println(parcelas);
        }

        sc.close();

    }
}

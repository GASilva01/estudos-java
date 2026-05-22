package models.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dataVencimento;
    private Double valorParcela;

    public Parcelas() {
    }

    public Parcelas(LocalDate dataVencimento, Double valorParcela) {
        this.dataVencimento = dataVencimento;
        this.valorParcela = valorParcela;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        return dataVencimento.format(formatter) + " - " + String.format("%.2f", valorParcela);
    }
}

package models.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private Integer numero;
    private LocalDate data;
    private Double valorTotal;

    private List<Parcelas> parcelas = new ArrayList<>();

    public Contrato(Integer numero, LocalDate data, Double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Integer getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public List<Parcelas> getParcelas() {
        return parcelas;
    }

}

package entities;

public class PessoaJuridica extends Contribuinte {
    private Integer qtdFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer qtdFuncionarios) {
        super(nome, rendaAnual);
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public Integer getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(Integer qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    @Override
    public double impostosPagos() {
        double valorImposto = 0.0;
        if (qtdFuncionarios < 10){
            valorImposto += getRendaAnual() * 0.16;
        } else {
            valorImposto += getRendaAnual() * 0.14;
        }
        return valorImposto;
    }
}

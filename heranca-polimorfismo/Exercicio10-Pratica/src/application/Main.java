package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> lista = new ArrayList<>();

        System.out.print("Quantos contribuintes? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados do contribuinte #%d: %n", (i+1));
            System.out.print("Pessoa física ou jurídica (f/j)?");
            char tipo = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();
            if (tipo == 'f'){
                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();
                lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else if (tipo == 'j') {
                System.out.print("Quantidade de funcionários: ");
                int qtdFuncionarios = sc.nextInt();
                lista.add(new PessoaJuridica(nome, rendaAnual, qtdFuncionarios));
            }else {
                System.out.println("Opção inválida.");
                i--;
            }
        }
        System.out.println("Impostos pagos por contribuinte: ");
        for (Contribuinte contribuinte : lista ){
            System.out.println(contribuinte.getNome() + ": $ " + String.format("%.2f", contribuinte.impostosPagos()));
        }
        System.out.println();
        double impostometro = 0.0;

        for (Contribuinte contribuinte : lista){
            impostometro += contribuinte.impostosPagos();
        }
        System.out.println("Total de impostos pagos: $ " + String.format("%.2f", impostometro));

        sc.close();
    }
}

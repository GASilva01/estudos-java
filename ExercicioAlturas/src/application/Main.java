package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão informadas? ");
        int qtd = sc.nextInt();
        Pessoa[] vetor = new Pessoa[qtd];
        sc.nextLine();

        for (int i = 0; i < vetor.length; i++){
            System.out.printf("Informe os dados da %dª pessoa:%n", i+1);
            System.out.print("Informe o nome: ");
            String nome = sc.nextLine();
            System.out.print("Informe a idade: ");
            int idade = sc.nextInt();
            System.out.print("Informe a altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            vetor[i] = new Pessoa(nome, idade, altura);
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i].getAltura();
        }

        double mediaAltura = soma / vetor.length;
        System.out.printf("Altura média: %.2f%n", mediaAltura);

        int contador = 0;
        for (int i = 0; i< vetor.length; i++){
            if (vetor[i].getIdade() <16){
                contador += 1;
            }
        }

        Pessoa[] sub_16 = new Pessoa[contador];

        for (int i = 0, j = 0; i< vetor.length; i++){
            if (vetor[i].getIdade() < 16){
                sub_16[j] = vetor [i];
                j++;
            }
        }

        double percentualMenor16 = contador * 100.0 / qtd;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenor16);

        for (int i = 0; i < sub_16.length; i++) {
            System.out.println(sub_16[i].getNome());
        }

        sc.close();
    }
}

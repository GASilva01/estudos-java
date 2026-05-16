package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       double[] vetor = new double[n];

       for (int i=0; i<n; i++){
           vetor[i] = sc.nextDouble();
       }
       double sum = 0.0;
       for (int i =0; i<n; i++){
           sum +=vetor[i];
       }
       double avg = sum / n;
       System.out.println("AVERAGE RATE: " + avg);

       sc.close();

    }
}

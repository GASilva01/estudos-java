package application;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        matriz[0][0] = 10;
        matriz[0][1] = 8;
        matriz[0][2] = 15;
        matriz[0][3] = 12;

        matriz[1][0] = 21;
        matriz[1][1] = 11;
        matriz[1][2] = 23;
        matriz[1][3] = 8;

        matriz[2][0] = 14;
        matriz[2][1] = 5;
        matriz[2][2] = 13;
        matriz[2][3] = 19;
        System.out.println("Bidimensional Array: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
        }

        System.out.printf("%n%nType number to check occurrence: %n%n");

        int checkOccurrence = 2;
        int indexOfI = 0;
        int indexOfJ = 0;
        int leftPosition = indexOfJ -1;
        int rightPosition = indexOfJ +1;
        int upPosition = indexOfI -1;
        int downPosition = indexOfI +1;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == checkOccurrence){
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }

                }
            }
        }

        sc.close();
    }

}




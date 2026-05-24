package application;

import entities.Client;

public class Main {
    static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println();

        String s3 = new String("Test");
        String s4 = new String("Test");

        System.out.println(s3 == s4);

        System.out.println();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); //Aqui ele compara o endereço(posição)
                                    // de memória no Heap



    }
}

package application;

import java.util.HashSet;
import java.util.Set;

public class Main {

    static void main(String[] args) {

        Set<String> set = new HashSet<>(); //Não garante ordem do conteúdo.

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");


        System.out.println(set.contains("Notebook"));

        for (String p : set){
            System.out.println(p);
        }
    }
}

package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    static void main(String[] args) {

        Set<String> set = new TreeSet<>(); //Ordena o conteúdo

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");


        System.out.println(set.contains("Notebook"));

        for (String p : set){
            System.out.println(p);
        }
    }
}

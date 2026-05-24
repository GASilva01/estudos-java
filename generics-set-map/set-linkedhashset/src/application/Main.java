package application;

import java.util.*;

public class Main {

    static void main(String[] args) {


        Set<String> set = new LinkedHashSet<>(); //Ordena o conteúdo

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");


        set.removeIf(x -> x.charAt(0) == 'T');


        for (String p : set){
            System.out.println(p);
        }
    }
}

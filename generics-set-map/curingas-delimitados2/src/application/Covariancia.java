package application;

import java.util.ArrayList;
import java.util.List;

public class Covariancia {
    static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);
        List<? extends Number> list = intList;
        Number x = list.get(0);
        // erro de compilacao list.add(20);
    }

}
package application;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

//        List<Object> myObjs = new ArrayList<Object>();
//        List<Integer> myNumbers = new ArrayList<Integer>();
//        myObjs = myNumbers; // erro de compilação


        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;


        Object obj;
        Integer x = 10;
        obj = x;
    }
}

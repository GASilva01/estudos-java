package application;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {

    public static void main(){
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);

        // erro de compilacao Number x = myNums.get(0);
    }



}

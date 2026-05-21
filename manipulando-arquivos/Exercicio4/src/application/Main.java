package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static void main(String[] args) {

        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "c:\\temp\\out.txt";
                                                              //True no argumento, impede de recriar e sobrescrever o arquivo.
                                                             //Sem argumento True, irá criar um arquivo novo sempre.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}



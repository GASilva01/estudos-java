package application;

import entities.LogEntry;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String path = "c:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null){

                String[] fields = line.split(" ");
                String username = fields[0];
                LocalDateTime moment = LocalDateTime.parse(fields[1]);

                set.add(new LogEntry(username, moment));
                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}

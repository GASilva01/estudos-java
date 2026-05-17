package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        Department dept = new Department(departmentName);

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine());

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, workerLevel, baseSalary, dept);

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i <n ; i++) {
            System.out.println("Enter contract #" + (i+1)+ " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hour = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hour);
            worker.addContract(contract);
        }

            System.out.print("Enter month and year to calculate income (MM/YYYY): ");
            String monthAndYear = sc.next();
            int month = Integer.parseInt(monthAndYear.substring(0, 2));
            int year = Integer.parseInt(monthAndYear.substring(3));

            System.out.println("Name: " + worker.getName());
            System.out.println("Department: " + worker.getDepartment().getName());
            System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f",worker.income(year, month)));











        sc.close();
    }
}

package Presentation;

import java.util.Scanner;

public class Ex11_Debuging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Peter";
        double currentBalance = 100;
        if (name.equals("Peter")) {
            double salary = Double.parseDouble(sc.nextLine());
            currentBalance = currentBalance + salary;
        }
        System.out.println(currentBalance);
    }
}

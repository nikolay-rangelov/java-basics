package Exercises;

import java.util.Scanner;

public class Ex05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = Integer.parseInt(sc.nextLine());
        int markers = Integer.parseInt(sc.nextLine());
        int litersCleaningAgent = Integer.parseInt(sc.nextLine());
        int discount = Integer.parseInt(sc.nextLine());

        double all = (pens * 5.80 + markers * 7.20 + litersCleaningAgent * 1.20) * ((100.0 - discount) / 100.0);

        System.out.println(all);
    }
}

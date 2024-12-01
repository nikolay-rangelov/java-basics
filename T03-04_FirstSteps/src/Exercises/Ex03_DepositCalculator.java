package Exercises;


import java.util.Scanner;

public class Ex03_DepositCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deposit = Double.parseDouble(sc.nextLine());
        int months = Integer.parseInt(sc.nextLine());
        double interest = Double.parseDouble(sc.nextLine());
        double product = deposit + months * ((deposit * interest) / 100 / 12);
        System.out.println(product);
    }
}

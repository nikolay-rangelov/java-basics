package Exercises;

import java.util.Scanner;

public class Ex01_USDToBGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd = Double.parseDouble(sc.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}

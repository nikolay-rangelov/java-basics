package MoreExercises;

import java.util.Scanner;

public class Ex06_Fishland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mackerelPriceKg = Double.parseDouble(sc.nextLine());
        double spratPriceKg = Double.parseDouble(sc.nextLine());
        double bonitoKg = Double.parseDouble(sc.nextLine());
        double horseMakerelKg = Double.parseDouble(sc.nextLine());
        int musselsKg = Integer.parseInt(sc.nextLine());

        double bonitoPriceKg = 1.60 * mackerelPriceKg;
        double horseMackerelPriceKg = 1.80 * spratPriceKg;
        double musselsPriceKg = 7.50;

        double all = bonitoKg * bonitoPriceKg + horseMakerelKg * horseMackerelPriceKg + musselsKg * musselsPriceKg;

        System.out.printf("%.2f", all);
    }
}

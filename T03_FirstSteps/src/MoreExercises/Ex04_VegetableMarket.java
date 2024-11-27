package MoreExercises;

import java.util.Scanner;

public class Ex04_VegetableMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double priceKgVeg = Double.parseDouble(sc.nextLine());
        double priceKgFruits = Double.parseDouble(sc.nextLine());
        double kgVeg = Double.parseDouble(sc.nextLine());
        double kgFruits = Double.parseDouble(sc.nextLine());

        double all = (priceKgFruits * kgFruits + priceKgVeg * kgVeg) / 1.94;

        System.out.printf("%.2f", all);
    }
}

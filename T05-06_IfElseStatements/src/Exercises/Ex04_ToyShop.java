package Exercises;

import java.util.Scanner;

public class Ex04_ToyShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tripPrice = Double.parseDouble(sc.nextLine());
        int puzzels = Integer.parseInt(sc.nextLine());
        int dolls = Integer.parseInt(sc.nextLine());
        int bears = Integer.parseInt(sc.nextLine());
        int minnions = Integer.parseInt(sc.nextLine());
        int trucks = Integer.parseInt(sc.nextLine());

        double profit = puzzels * 2.60 + dolls * 3.0 + bears * 4.10 + minnions * 8.20 + trucks * 2.0;
        int numberOfToys = puzzels + dolls + bears + minnions + trucks;

        if (numberOfToys >= 50) {
            profit = profit * 0.75; // 25% off
        }

        profit = profit * 0.90; // -10% for rent

        if(profit >= tripPrice){
            System.out.printf("Yes! %.2f lv left.", profit - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - profit);
        }
    }
}

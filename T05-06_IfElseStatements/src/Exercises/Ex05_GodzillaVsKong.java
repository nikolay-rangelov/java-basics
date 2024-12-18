package Exercises;

import java.util.Scanner;

public class Ex05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double filmBudget = Double.parseDouble(sc.nextLine());
        int backgroundActors = Integer.parseInt(sc.nextLine());
        double clothingPricePerActor = Double.parseDouble(sc.nextLine());

        double decorPrice = 0.10 * filmBudget;
        double clothingPrice = clothingPricePerActor * backgroundActors;
        if (backgroundActors > 150) {
            clothingPrice = clothingPrice * 0.90;
        }
        double neededMoney = decorPrice + clothingPrice;
        if (neededMoney > filmBudget){
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", neededMoney - filmBudget);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", filmBudget - neededMoney);
        }
    }
}
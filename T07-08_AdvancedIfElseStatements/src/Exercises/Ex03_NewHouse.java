package Exercises;

import java.util.Scanner;

public class Ex03_NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String typeFlowers = sc.nextLine();
        int numberFlowers = Integer.parseInt(sc.nextLine());
        Double budget = Double.parseDouble(sc.nextLine());
        double price = 0.0;
        double leftSum = 1.0;

        if (numberFlowers > 80 && typeFlowers.equals("Roses")) {
            leftSum = 0.90;
        }

        if ((numberFlowers > 90 && typeFlowers.equals("Dahlias")) ||
                (numberFlowers > 80 && typeFlowers.equals("Tulips"))) {
            leftSum = 0.85;
        }

        if (numberFlowers < 120 && typeFlowers.equals("Narcissus")) {
            leftSum = 1.15;
        }

        if (numberFlowers < 80 && typeFlowers.equals("Gladiolus")) {
            leftSum = 1.20;
        }

        switch (typeFlowers) {
            case "Roses":
                price = 5.0;
                break;
            case "Dahlias":
                price = 3.80;
                break;
            case "Tulips":
                price = 2.80;
                break;
            case "Narcissus":
                price = 3.0;
                break;
            case "Gladiolus":
                price = 2.50;
                break;
        }

        double all = leftSum * price * numberFlowers;

        if (budget >= all) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, typeFlowers, budget - all);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", all - budget);
        }
    }
}

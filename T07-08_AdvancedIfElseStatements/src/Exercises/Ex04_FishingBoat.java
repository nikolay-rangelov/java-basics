package Exercises;

import java.util.Scanner;

public class Ex04_FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fisherman = Integer.parseInt(sc.nextLine());

        double discount = 0.0;
        double shipPrice = 0.0;

        switch (season) {
            case "Spring":
                shipPrice = 3000.0;
                break;
            case "Summer":
            case "Autumn":
                shipPrice = 4200.0;
                break;
            case "Winter":
                shipPrice = 2600.0;
                break;
        }

        if (fisherman <= 6) {
            discount = 0.10;
        } else if (7 <= fisherman && fisherman <= 11) {
            discount = 0.15;
        } else if (12 <= fisherman) {
            discount = 0.25;
        }

        double all = shipPrice * (1.0 - discount);

        if (fisherman % 2 == 0 && !(season.equals("Autumn"))) {
            all = all * 0.95;
        }

        if (budget >= all) {
            System.out.printf("Yes! You have %.2f leva left.", budget - all);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", all - budget);
        }
    }
}

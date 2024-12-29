package Exercises;

import java.util.Scanner;

public class Ex05_Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        String destination = "";
        String type = "";
        double spentPercent = 0.0;

        if(season.equals("summer")) {
            type = "Camp";
        } else if (season.equals("winter")){
            type = "Hotel";
        }

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                spentPercent = 0.30;
            } else if (season.equals("winter")) {
                spentPercent = 0.70;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                spentPercent = 0.40;
            } else if (season.equals("winter")) {
                spentPercent = 0.80;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            spentPercent = 0.90;
        }

        if (destination.equals("Europe")) {
            type = "Hotel";
        }

        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", type, budget * spentPercent);
    }
}

package Exercises;

import java.util.Scanner;

public class Ex02_BonusScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        double bonusPoints = 0.0;
        if (number <= 100) {
            bonusPoints = 5;
        } else if (100 < number && number <= 1000) {
            bonusPoints = 0.20 * number;
        } else if (1000 < number) {
            bonusPoints = 0.10 * number;
        }

        if (number % 2 == 0) {
            bonusPoints = bonusPoints + 1;
        }

        if (number % 10 == 5) {
            bonusPoints = bonusPoints + 2;
        }

        System.out.printf("%.1f%n", bonusPoints);
        System.out.printf("%.1f", number + bonusPoints);
    }
}

package Exercises;

import java.util.Scanner;

public class Ex07_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        double videocards = Double.parseDouble(sc.nextLine());
        double processors = Double.parseDouble(sc.nextLine());
        double ram = Double.parseDouble(sc.nextLine());

        double videocardsPrice = 250;
        double processorsPrice = 0.35 * videocardsPrice * videocards;
        double ramPrice = 0.10 * videocardsPrice * videocards;

        double all = videocardsPrice * videocards + processorsPrice * processors + ramPrice * ram;

        if (videocards > processors) {
            all = 0.85 * all;
        }
        if (budget >= all) {
            System.out.printf("You have %.2f leva left!", budget - all);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", all - budget);
        }
    }
}

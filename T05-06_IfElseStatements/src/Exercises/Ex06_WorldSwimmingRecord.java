package Exercises;

import java.util.Scanner;

public class Ex06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double worldRecordT = Double.parseDouble(sc.nextLine());
        double worldRecordS = Double.parseDouble(sc.nextLine());
        double worldRecordV = worldRecordS / worldRecordT;

        double personV = Double.parseDouble(sc.nextLine());

        double resistanceV = Math.floor(15.0 / 12.5);
        personV = personV - resistanceV;
        double personT = worldRecordS / personV;

        if (personT < worldRecordT) {
            System.out.printf("Yes, he succeeded! The new world record is {времето на Иван seconds.");
        } else {
            System.out.printf("No, he failed! He was {недостигащите секунди} seconds slower.");
        }


        /*
        double personV = 1.0 / personSecondsForMeter;
        double worldRecordV = worldRecordMeters / worldRecordSeconds;
        double resistanceV = Math.floor(15.0 / 12.5);
        personV = personV - resistanceV;
        if (personV < worldRecordV) {
            System.out.printf("Yes, he succeeded! The new world record is {времето на Иван seconds.");
        } else {
            System.out.printf("No, he failed! He was {недостигащите секунди} seconds slower.");
        }
         */
    }
}

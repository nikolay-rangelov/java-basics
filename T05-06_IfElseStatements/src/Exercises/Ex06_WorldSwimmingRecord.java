package Exercises;

import java.util.Scanner;

public class Ex06_WorldSwimmingRecord {
    public static void main(String[] args) {
        /*
        T is in seconds
        S is in meters
        V is in meters per second
         */
        Scanner sc = new Scanner(System.in);
        double worldRecordT = Double.parseDouble(sc.nextLine());
        double worldRecordS = Double.parseDouble(sc.nextLine());
        double wordRecordV = worldRecordS / worldRecordT;

        double personTimeFor1Meter = Double.parseDouble(sc.nextLine());
        double personV = 1.0 / personTimeFor1Meter;

        double personT = worldRecordS / personV;
        double delayT = Math.floor(worldRecordS / 15.0) * 12.5;


        if (personT + delayT < worldRecordT) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", personT + delayT);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", personT + delayT - worldRecordT);
        }
    }
}

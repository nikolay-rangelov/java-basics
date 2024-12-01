package Exercises;

import java.util.Scanner;

public class Ex09_FishTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int h = Integer.parseInt(sc.nextLine());
        double accessoriesVolumePercentage = Double.parseDouble(sc.nextLine());

        double waterL = (a * b * h * ((100.0 - accessoriesVolumePercentage) / 100.0)) * 0.001;

        System.out.println(waterL);
    }
}

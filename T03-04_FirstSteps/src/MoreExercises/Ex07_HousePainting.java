package MoreExercises;

import java.util.Scanner;

public class Ex07_HousePainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());

        double greenAreaM2 = 2 * x * x - 1.2 * 2 + 2 * x * y - 2 * 1.5 * 1.5;
        double redAreaM2 = x * y * 2 + x * h;

        System.out.printf("%.2f%n%.2f", (greenAreaM2 / 3.4), (redAreaM2 / 4.3));
    }
}

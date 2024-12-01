package MoreExercises;

import java.util.Scanner;

public class Ex03_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = Double.parseDouble(sc.nextLine());
        double fahrenheit = celsius * (9.0 / 5.0) + 32;
        System.out.printf("%.2f", fahrenheit);
    }
}

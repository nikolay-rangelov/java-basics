package MoreExercises;

import java.util.Scanner;

public class Ex10_WeatherForecast2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double degrees = Double.parseDouble(sc.nextLine());
        if(5.00 <= degrees && degrees <= 11.9) {
            System.out.println("Cold");
        } else if (12.00 <= degrees && degrees <= 14.90) {
            System.out.println("Cool");
        } else if (15.00 <= degrees && degrees <= 20.00) {
            System.out.println("Mild");
        } else if (20.1 <= degrees && degrees <= 25.9) {
            System.out.println("Warm");
        } else if (26.0 <= degrees && degrees <= 35.0) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}

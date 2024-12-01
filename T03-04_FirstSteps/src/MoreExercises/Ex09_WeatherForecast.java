package MoreExercises;

import java.util.Scanner;

public class Ex09_WeatherForecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }
    }
}

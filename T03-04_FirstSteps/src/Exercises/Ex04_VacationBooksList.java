package Exercises;

import java.util.Scanner;

public class Ex04_VacationBooksList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pagesInBook = Integer.parseInt(sc.nextLine());
        int pagesPerHour = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());
        int hoursPerDay = (int)((double) pagesInBook / ((double) pagesPerHour * (double) days));
        System.out.println(hoursPerDay);
    }
}

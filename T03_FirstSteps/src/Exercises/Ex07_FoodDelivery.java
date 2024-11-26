package Exercises;

import java.util.Scanner;

public class Ex07_FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chickenMenus = Integer.parseInt(sc.nextLine());
        int fishMenus = Integer.parseInt(sc.nextLine());
        int vegiMenus = Integer.parseInt(sc.nextLine());

        double all = (chickenMenus * 10.35 + fishMenus * 12.40 + vegiMenus * 8.15) * 1.20 + 2.50;

        System.out.println(all);
    }
}

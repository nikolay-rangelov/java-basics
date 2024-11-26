package Exercises;

import java.util.Scanner;

public class Ex08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int feePerYear = Integer.parseInt(sc.nextLine());
        double shoes = feePerYear * 0.60;
        double cloths = shoes * 0.80;
        double ball = cloths * 0.25;
        double accessories = 0.20 * ball;

        double all = shoes + cloths + ball + accessories + feePerYear;

        System.out.println(all);
    }
}

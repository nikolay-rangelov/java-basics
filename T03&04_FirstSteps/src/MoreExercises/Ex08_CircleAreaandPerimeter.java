package MoreExercises;

import java.util.Scanner;

public class Ex08_CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = Double.parseDouble(sc.nextLine());

        System.out.printf("%.2f%n", Math.PI * Math.pow(r, 2));
        System.out.printf("%.2f", 2 * Math.PI * r);
    }
}

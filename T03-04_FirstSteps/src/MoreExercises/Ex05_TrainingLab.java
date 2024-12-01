package MoreExercises;

import java.util.Scanner;

public class Ex05_TrainingLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());

        int a = (int)((w * 100) / 120);
        int b = (int)(((h * 100) - 100) / 70);
        int tables = a * b - 3;

        System.out.println(tables);
    }
}

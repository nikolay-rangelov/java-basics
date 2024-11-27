package Presentation;

import java.util.Scanner;

public class Ex05_Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        //int area = a * a;
        double area = Math.pow(a, 2);
        System.out.printf("%.0f", area);
    }
}

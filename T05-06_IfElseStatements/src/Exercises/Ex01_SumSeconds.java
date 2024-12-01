package Exercises;

import java.util.Scanner;

public class Ex01_SumSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secFirst = Integer.parseInt(sc.nextLine());
        int secSecond = Integer.parseInt(sc.nextLine());
        int secThird = Integer.parseInt(sc.nextLine());

        int sum = secFirst + secSecond + secThird;

        int minutes = sum / 60;
        int seconds = sum % 60;

        System.out.printf("%d:%02d", minutes, seconds);
    }
}

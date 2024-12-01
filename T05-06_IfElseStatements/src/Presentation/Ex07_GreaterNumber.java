package Presentation;

import java.util.Scanner;

public class Ex07_GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        numbers[0] = Integer.parseInt(sc.nextLine());
        numbers[1] = Integer.parseInt(sc.nextLine());
        if (numbers[0] > numbers[1]){
            System.out.println(numbers[0]);
        } else {
            System.out.println(numbers[1]);
        }
    }
}

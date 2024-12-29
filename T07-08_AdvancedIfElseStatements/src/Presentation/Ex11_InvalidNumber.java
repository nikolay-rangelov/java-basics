package Presentation;

import java.util.Scanner;

public class Ex11_InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        boolean valid = (100 <= number && number <=200) || number == 0;
        if(!valid) {
            System.out.println("invalid");
        }
    }
}

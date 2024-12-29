package Presentation;

import java.util.Scanner;

public class Ex10_LogicalNegation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        boolean isValid = (number > 10) && (number % 2 == 0);
        if(!isValid){
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }

    }
}

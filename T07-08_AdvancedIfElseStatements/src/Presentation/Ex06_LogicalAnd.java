package Presentation;

import java.util.Scanner;

public class Ex06_LogicalAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        if (a > 5 && a <10 && a % 2 == 0) {
            System.out.println("yes");
        }
    }
}

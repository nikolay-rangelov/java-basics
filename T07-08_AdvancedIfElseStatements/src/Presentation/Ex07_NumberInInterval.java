package Presentation;

import java.util.Scanner;

public class Ex07_NumberInInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if (-100 <= n && n <= 100 && n != 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

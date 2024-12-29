package Presentation;

import java.util.Scanner;

public class Ex08_ExampleOrDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("Example") || input.equals("Demo")) {
            System.out.println("Example or Demo world");
        }
    }
}

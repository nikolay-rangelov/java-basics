package Lab;

import java.util.Scanner;

public class Ex05_GreetingByName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.printf("Hello, %s!", name);
        sc.close();
    }
}

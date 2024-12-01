package Presentation;

import java.util.Scanner;

public class Ex04_TextComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = "Example";
        String b = a;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String c = sc.nextLine(); // input the same string below also
        String d = sc.nextLine();

        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}

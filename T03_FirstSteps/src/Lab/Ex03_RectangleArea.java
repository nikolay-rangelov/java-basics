package Lab;

import java.util.Scanner;

public class Ex03_RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int area = a * b;
        System.out.println(area);
    }
}

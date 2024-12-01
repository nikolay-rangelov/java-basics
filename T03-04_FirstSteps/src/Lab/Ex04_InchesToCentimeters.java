package Lab;

import java.util.Scanner;

public class Ex04_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inches = Double.parseDouble(sc.nextLine());
        double cm = inches * 2.54;
        System.out.println(cm);
    }
}

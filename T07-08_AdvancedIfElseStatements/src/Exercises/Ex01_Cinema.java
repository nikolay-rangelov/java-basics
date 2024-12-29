package Exercises;

import java.util.Scanner;

public class Ex01_Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int r = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        boolean isInputValid = true;
        double price = 0.0;
        switch (type) {
            case "Premiere":
                price = 12.00;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5.00;
                break;
            default:
                isInputValid = false;
                break;
        }

        if (isInputValid) {
            System.out.printf("%.2f leva", price * r * c);
        }
    }
}

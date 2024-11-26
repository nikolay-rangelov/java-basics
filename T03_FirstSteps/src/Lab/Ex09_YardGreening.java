package Lab;

import java.util.Scanner;

public class Ex09_YardGreening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km2 = Double.parseDouble(sc.nextLine());
        double price = km2 * 7.61;
        double finalPrice = km2 * 7.61 * 0.82;
        double discount = price * 0.18;
        System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv.", finalPrice, discount);
    }
}

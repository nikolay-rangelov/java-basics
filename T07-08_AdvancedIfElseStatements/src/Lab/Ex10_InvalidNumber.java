package Lab;

import java.util.Scanner;

public class Ex10_InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        boolean isValid = (100 <= number && number <= 200) || number == 0;
        if (!isValid) {
            System.out.println("invalid");
        }
    }
}

package Lab;

import java.util.Scanner;

public class Ex11_FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        Boolean workingDay = null;
        Boolean validFruit = true;
        double price = 0.0;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                workingDay = true;
                break;
            case "Saturday":
            case "Sunday":
                workingDay = false;
                break;
            default:
                workingDay = null;
                break;
        }
        if(Boolean.TRUE.equals(workingDay)) {
            switch (fruit) {
                case "banana":
                    price = 2.50;
                    break;
                case "apple":
                    price = 1.20;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.70;
                    break;
                case "pineapple":
                    price = 5.50;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
                default:
                    validFruit = false;
                    break;
            }
        } else if (Boolean.FALSE.equals(workingDay)) {
            switch (fruit) {
                case "banana":
                    price = 2.70;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price = 1.60;
                    break;
                case "kiwi":
                    price = 3.00;
                    break;
                case "pineapple":
                    price = 5.60;
                    break;
                case "grapes":
                    price = 4.20;
                    break;
                default:
                    validFruit = false;
                    break;
            }
        }

        if (Boolean.FALSE.equals(validFruit) || workingDay == null) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", price * quantity);
        }
    }
}

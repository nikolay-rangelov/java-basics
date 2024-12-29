package Lab;

import java.util.Scanner;

public class Ex07_WorkingHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        String day = sc.nextLine();
        boolean isOpen = false;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (10 <= hour && hour <= 18) {
                    isOpen = true;
                }
                break;
            case "Sunday":
            default:
                isOpen = false;
        }
        if (isOpen) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}

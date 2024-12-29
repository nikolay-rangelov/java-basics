package Lab;

import java.util.Scanner;

public class Ex12_TradeCommissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        double sells = Double.parseDouble(sc.nextLine());
        double comission = 0.5;
        boolean isCityValid = true;
        switch (city) {
            case "Sofia":
                if (0 <= sells && sells <= 500) {
                    comission = 0.05;
                } else if (500 < sells && sells <= 1000) {
                    comission = 0.07;
                } else if (1000 < sells && sells <= 10000) {
                    comission = 0.08;
                } else if (sells > 10000) {
                    comission = 0.12;
                }
                break;
            case "Varna":
                if (0 <= sells && sells <= 500) {
                    comission = 0.045;
                } else if (500 < sells && sells <= 1000) {
                    comission = 0.075;
                } else if (1000 < sells && sells <= 10000) {
                    comission = 0.10;
                } else if (sells > 10000) {
                    comission = 0.13;
                }
                break;
            case "Plovdiv":
                if (0 <= sells && sells <= 500) {
                    comission = 0.055;
                } else if (500 < sells && sells <= 1000) {
                    comission = 0.08;
                } else if (1000 < sells && sells <= 10000) {
                    comission = 0.12;
                } else if (sells > 10000) {
                    comission = 0.145;
                }
                break;
            default:
                isCityValid = false;
                break;
        }

        if (isCityValid == false || sells < 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", comission * sells);
        }
    }
}

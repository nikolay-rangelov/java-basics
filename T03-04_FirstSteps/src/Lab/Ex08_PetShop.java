package Lab;

import java.util.Scanner;

public class Ex08_PetShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dogsPackages = Integer.parseInt(sc.nextLine());
        int catsPackages = Integer.parseInt(sc.nextLine());
        double all = dogsPackages * 2.50 + catsPackages * 4.0;
        System.out.printf("%.2f lv.", all);
    }
}

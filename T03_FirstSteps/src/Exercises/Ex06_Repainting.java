package Exercises;

import java.util.Scanner;

public class Ex06_Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plasticM2 = Integer.parseInt(sc.nextLine());
        int paintL = Integer.parseInt(sc.nextLine());
        int thinnerL = Integer.parseInt(sc.nextLine());
        int hoursWork = Integer.parseInt(sc.nextLine());

        double allMaterials = ((plasticM2 + 2) * 1.50 + paintL * 14.50 * 1.10 + thinnerL * 5.00 + 0.40);
        double allWork = allMaterials * 0.30 * hoursWork;

        System.out.println(allMaterials + allWork);
    }
}

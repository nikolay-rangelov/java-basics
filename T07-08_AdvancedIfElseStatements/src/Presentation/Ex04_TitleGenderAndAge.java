package Presentation;

import java.util.Scanner;

public class Ex04_TitleGenderAndAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        char gender = sc.nextLine().charAt(0);

        if(gender == 'f') {
            if (age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else if (gender == 'm') {
            if (age < 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        }
    }
}

package Presentation;

import java.util.Scanner;

public class Ex04_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.printf("The entered name is: %s", name);

         */

        /*
        //int age = Integer.parseInt(sc.nextLine());
        int age = sc.nextInt();
        System.out.println(age);
        */
        /*
        String stringInput = "Ivan Petrov\n 13 14 \n Ivanov";
        Scanner scString = new Scanner(stringInput);
        String firstName = scString.next();
        String number1 = scString.next();
        String number2 = scString.next();
        String lastName = scString.next();
        System.out.printf("%s %s %s %s", firstName, number1, number2, lastName);
         */

        /*
        String stringInput = "John Doe\n\n  Doe John\n To be or not to be, that is the question.";
        Scanner scString2 = new Scanner(stringInput);
        String firstName = scString2.nextLine();
        scString2.nextLine();
        String lastName = scString2.nextLine();
        System.out.printf("%s,%s", firstName, lastName);

         */

        String stringInput = "16 \n John Ivan Ivanov\n Doe\n\n  Doe John\n To be or not to be, that is the question.";
        Scanner scString2 = new Scanner(stringInput);
        int number = scString2.nextInt();
        String middle = scString2.next();
        String name = scString2.nextLine();
        System.out.printf("%d,%s,%s", number, middle, name);

    }
}

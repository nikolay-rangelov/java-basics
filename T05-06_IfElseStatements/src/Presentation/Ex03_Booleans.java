package Presentation;

public class Ex03_Booleans {
    public static void main(String[] args) {
        /*
        int a;
        boolean b;
        System.out.println(a); // variable might not be initialized
         */

        /*
        int a = -55;
        boolean isValid = true;
        boolean isPositive = a > 0;
        System.out.println(isPositive);
        */
        Boolean a = null;
        if (a) {
            System.out.println("In if statement"); // gives exeption
        }
    }
}

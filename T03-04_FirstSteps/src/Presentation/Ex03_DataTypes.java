package Presentation;

public class Ex03_DataTypes {
    public static void main(String[] args) {
        int age = 18;
        double pi = 3.14;
        String name = "Nikolay";
        char initial = 'N';

        System.out.printf("Age: %d;%n" +
                          "Pi: %.2f;%n" +
                          "Name: %s;%n" +
                          "Initial: %c;", age, pi, name, initial);

        // %n - platform independant for new line
    }
}

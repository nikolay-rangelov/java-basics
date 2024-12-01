package Presentation;

public class Ex13_VariableScope {
    public static void main(String[] args) {
        String currentDay = "Monday";
        if (currentDay.equals("Monday")) {
            double salary = 4.6;
            double rt = 5.6;
        }
        double a = 5.0;
        System.out.println(currentDay);
    }
}

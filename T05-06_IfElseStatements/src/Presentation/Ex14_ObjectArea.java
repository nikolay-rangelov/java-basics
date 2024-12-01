package Presentation;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Ex14_ObjectArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String object = sc.nextLine();
        double area = 0.0;
        if (object.equals("square")) {
            double a = Double.parseDouble(sc.nextLine());
            area = a * a;
        } else if (object.equals("circle")) {
            double r = Double.parseDouble(sc.nextLine());
            area = Math.PI * r * r;
        } else if (object.equals("triangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double h = Double.parseDouble(sc.nextLine());
            area = a * h / 2.0;
        }
        System.out.println(area);
    }
}

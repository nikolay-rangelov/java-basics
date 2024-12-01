package Lab;

import java.util.Scanner;

public class Ex07_AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        double area = 0.0;
        if (figure.equals("square")) {
            double a = Double.parseDouble(sc.nextLine());
            area = Math.pow(a, 2);
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            area = a * b;
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(sc.nextLine());
            area = Math.PI * Math.pow(r, 2);
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double h = Double.parseDouble(sc.nextLine());
            area = a * h / 2.0;
        }
        System.out.printf("%.3f", area);
    }
}

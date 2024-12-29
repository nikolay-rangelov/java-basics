package Presentation;

public class Ex12_PrioritizingConditions {
    public static void main(String[] args) {
        int a = 50;
        int b = 200;
        int c = 300;
        if ((a >=100 && b <= 200) || (c + b >= 200 && c <= 400)) {
            System.out.println("Yes");
        }
        if (a >=100 && (b <= 200 || c + b >= 200) && c <= 400) {
            System.out.println("Yes");
        }
    }
}

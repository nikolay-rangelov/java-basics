package Lab;

import java.util.Scanner;

public class Ex04_PasswordGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputPassword = sc.nextLine();
        String storedPassword = "s3cr3t!P@ssw0rd";
        if (inputPassword.equals(storedPassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}

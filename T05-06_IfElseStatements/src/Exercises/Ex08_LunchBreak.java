package Exercises;

import java.util.Scanner;

public class Ex08_LunchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = sc.nextLine();
        double movieDuration = Integer.parseInt(sc.nextLine());
        double breakDuration = Double.parseDouble(sc.nextLine());

        double lunchDuration = breakDuration * 1.0/8.0;
        double recreationTime = breakDuration * 0.25;
        double timeLeft = breakDuration - lunchDuration - recreationTime;

        if(timeLeft >= movieDuration) {
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.", movie, (int)Math.ceil(timeLeft - movieDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.", movie, (int)Math.ceil(movieDuration - timeLeft));
        }
    }
}

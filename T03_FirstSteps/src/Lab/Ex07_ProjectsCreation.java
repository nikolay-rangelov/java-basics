package Lab;

import java.util.Scanner;

public class Ex07_ProjectsCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int projects = Integer.parseInt(sc.nextLine());
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, projects * 3, projects);
    }
}

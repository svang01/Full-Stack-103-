package Day2.Scanner;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi, " + name + "!");
    }
}


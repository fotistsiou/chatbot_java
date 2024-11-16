package fotistsiou.java.chatbot.step_2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public final static String botName = "Botty";
    public static int currentYear = LocalDate.now().getYear();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is " + Main.botName + ".");
        System.out.println("I was created in " + Main.currentYear + ".");
        System.out.println("Please, remind me your name.");

        String yourName = scanner.nextLine();

        System.out.println("What a great name you have, " + yourName + "!");

        scanner.close();
    }
}

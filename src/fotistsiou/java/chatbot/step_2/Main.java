package fotistsiou.java.chatbot.step_2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Introduce yourself
 * ------------------
 * Description
 * The greeting part is great, but chatbots are also supposed to interact with a user.
 * It's time to implement this functionality.
 * ------------------
 * Objective
 * In this stage, you will introduce yourself to the bot so that it can greet you by your name.
 * Your program should print the following lines:
 * 1. Hello! My name is Aid.
 * 2. I was created in 2023.
 * 3. Please, remind me your name.
 * 4. What a great name you have, {yourName}!
 * You may change the name and the creation year of your bot if you want.
 * Instead of {yourName}, the bot must print your name entered from the standard input.
 */

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

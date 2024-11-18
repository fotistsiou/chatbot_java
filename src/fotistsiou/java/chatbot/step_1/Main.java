package fotistsiou.java.chatbot.step_1;

import java.time.LocalDate;

/**
 * Meet your chat bot
 * ------------------
 * Description
 * Digital personal assistants help people drive cars, plan their day, and buy something online. In a sense, they are
 * simplified versions of artificial intelligence with whom you can talk.
 * In this project, you will develop, step by step, a simple bot that will help you study programming.
 * ------------------
 * Objective
 * For the first stage, you will write a bot that displays a greeting, its name, and the year it was created.
 * First impressions count!
 * Your program should print the following lines:
 * 1. Hello! My name is {botName}.
 * 2. I was created in {birthYear}.
 * Instead of {botName}, print any name you choose and replace {birthYear} with the current year (four digits).
 * You don't need to take any input at this stage.
 */

public class Main {
    public final static String botName = "Botty";
    public static int currentYear = LocalDate.now().getYear();

    public static void main(String[] args) {
        System.out.println("Hello! My name is " + Main.botName + ".");
        System.out.println("I was created in " + Main.currentYear + ".");
    }
}

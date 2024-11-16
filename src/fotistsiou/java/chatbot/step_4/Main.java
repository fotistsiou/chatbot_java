package fotistsiou.java.chatbot.step_4;

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
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Completed, have a nice day!");

        scanner.close();
    }
}

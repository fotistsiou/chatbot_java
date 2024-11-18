package fotistsiou.java.chatbot.step_3;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Let the chat bot guess your age
 * -------------------------------
 * Description
 * Keep improving your bot by developing new skills for it. We suggest a simple guessing game that will predict the
 * age of a user.
 * It's based on a simple math trick. First, take a look at this formula:
 * - age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
 * The numbers remainder3, remainder5, and remainder7 are the remainders of the division of age by 3, 5, and 7 respectively.
 * It turns out that for each number ranging from 0 to 104, the calculation will result in the number itself.
 * This perfectly fits the ordinary age range, doesn't it? Ask the user for the remainders and use them to guess the age!
 * -------------------------------
 * Objective
 * In this stage, you will introduce yourself to the bot. It will greet you by your name and then try to guess your
 * age using arithmetic operations. Your program should print the following lines:
 * 1. Hello! My name is Aid.
 * 2. I was created in 2023.
 * 3. Please, remind me your name.
 * 4. What a great name you have, Max!
 * 5. Let me guess your age.
 * 6. Enter remainders of dividing your age by 3, 5 and 7.
 * 7. Your age is {yourAge}; that's a good time to start programming!
 * Read three numbers from the standard input. Assume that all the numbers will be given on separate lines.
 * Instead of {yourAge}, the bot will print the age determined according to the special formula discussed above.
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
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        scanner.close();
    }
}

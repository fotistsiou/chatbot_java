package fotistsiou.java.chatbot.step_5;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Play a simple quiz together
 * ---------------------------
 * Description
 * At the final stage, you will improve your simple bot so that it can give you a test and check your answers.
 * The test should be a multiple-choice quiz about programming with any number of options. Your bot has to repeat
 * the test until you answer correctly and congratulate you upon completion.
 * ---------------------------
 * Objective
 * Your bot can ask anything you want, but there are two rules for your output:
 * - the line with the test should end with the question mark character;
 * - an option starts with a digit followed by the dot (1., 2., 3., 4.)
 * If a user enters an incorrect answer, the bot may print a message:
 * - Please, try again.
 * The program should stop on the correct answer and print Congratulations, have a nice day! at the end.
 */

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public final static String botName = "Botty";
    public static int currentYear = LocalDate.now().getYear();

    public static void main(String[] args) {
        greet(Main.botName, Main.currentYear);
        remindName();
        guessAge();
        count();
        test();
        end();
        scanner.close();
    }

    static void greet(String assistantName, int birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        while (true) {
            int answer = scanner.nextInt();
            if (answer == 2) {
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}

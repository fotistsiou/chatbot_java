package fotistsiou.java.chatbot.step_1;

import java.time.LocalDate;

public class Main {
    public final static String botName = "Botty";
    public static int currentYear = LocalDate.now().getYear();

    public static void main(String[] args) {
        System.out.println("Hello! My name is " + Main.botName + ".");
        System.out.println("I was created in " + Main.currentYear + ".");
    }
}

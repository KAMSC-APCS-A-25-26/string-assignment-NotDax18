import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // List of banned words
        String[] banned = {"dang", "nuts", "oops", "yikes"};

        // Censor each banned word using word boundaries
        for (String word : banned) {
            input = input.replaceAll("\\b" + word + "\\b", "***");
        }

        System.out.println("Censored: " + input);
    }
}
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String lowerWord = word.toLowerCase();
        String reversed = "";

        for (int i = lowerWord.length() - 1; i >= 0; i--) {
            reversed += lowerWord.charAt(i);
        }

        if (lowerWord.equals(reversed)) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }

        scanner.close();
    }
}
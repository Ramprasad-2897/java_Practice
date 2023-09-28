//Write a Java program that takes a user-input string and prints the first character of the input string.
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the word");
        String userInput = scanner.next();
        if (!userInput.isEmpty()) {
            char firstCharacter = userInput.charAt(5);
            System.out.println("The first character is: " + firstCharacter);
        } else {
            System.out.println("The input string is empty.");
        }

        scanner.close();
    }
}

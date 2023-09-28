//Create a Java program that takes a
// user-input string and converts it to uppercase.
// Then, print the converted string.
import java.util.Scanner;
public class StringConversion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String userInput = scanner.next();
        String uppercaseString = userInput.isEmpty() ? "" : userInput.toUpperCase();
        System.out.println("Uppercase version: " + uppercaseString);
scanner.close();

    }
}





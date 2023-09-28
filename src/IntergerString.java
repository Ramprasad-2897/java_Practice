import java.util.Scanner;
public class IntergerString {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the integer");
    int Number = scanner.nextInt();
    String numberAsString = Integer.toString(Number);
    System.out.println("The integer string is " + numberAsString);
    scanner.close();
}
}

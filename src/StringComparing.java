import java.util.Scanner;
public class StringComparing {
    public static void main(String[] args){
        Scanner scanner  =  new Scanner(System.in);
        System.out.println("Enter the first string");
        String string1 = scanner.nextLine();
        System.out.println("Enter the Second string");
        String string2 = scanner.nextLine();
        boolean areEqual = string1.equals(string2);
        if (areEqual) {
            System.out.println("The strings are equal");
        }
        else {
            System.out.println("The strings are not equal");
        }
    scanner.close();
    }
}

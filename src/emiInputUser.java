import java.util.Scanner;
public class emiInputUser{
    public static void main (String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the initial investment amount: ");
        double investment = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        System.out.print("Enter the annual interest rate (as a percentage): ");
        double annualInterestRate = scanner.nextDouble();

        // Convert the annual interest rate to monthly interest rate
        double monthlyInterestRate = (annualInterestRate / 12 / 100);

        // Calculate the future investment value
        double futureInvestmentValue = investment * Math.pow(1 + monthlyInterestRate, (numberOfYears * 12));

        // Display the result
        System.out.println("The future investment value is " + futureInvestmentValue);

        // Close the Scanner
        scanner.close();
    }
}
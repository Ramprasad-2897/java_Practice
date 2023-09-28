//Write a program that reads in investment amount, annual interest rate, and number of years and displays the future investment value using the following formula
//futureInvestmentValue = investmentAmount x (1 + monthlyInterestRate) ^ (numberOfYears * 12)

public class Dorbala_2_21 {
    public static void main(String[] args) {
        //investment
        double investment = 100.56;
        int numberOfYears = 1;
        double annulaInterstRate = 4.25;
        double monthlyInterstRate = (annulaInterstRate / 12/100);
        //futureInvestmentValue = investmentAmount x (1 + monthlyInterestRate) ^ (numberOfYears * 12)
        double futureInvestmentValue = investment * Math.pow(1 + monthlyInterstRate, (numberOfYears * 12));
        System.out.println("the future investment value is " + futureInvestmentValue);
    }
}
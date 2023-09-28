import java.util.Scanner;
public class EMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    System.out.println("Enter princple amount is ");
    double princple = input.nextDouble();
    System.out.println("Enter interst rate");
    double interstRate = input.nextDouble();
    System.out.println("Enter number of years");
    double years = input.nextInt();
    //calculate the monthly interst rate
    double monthlyInterst = interstRate/12;
    //calcumate number of months
    double months = years*12;
    //calculate monthly emi
        double monthlyEmi = (princple * monthlyInterst * Math.pow(1 + monthlyInterst, months)) / (Math.pow(1 + monthlyInterst, months) - 1);    //calculate total payments
    double totalPayments=monthlyEmi*months;
    //total interst calculation
        double totalInterest = totalPayments - princple;

        System.out.println("Monthly payment is "+monthlyEmi);
        System.out.println("total payment is" +totalPayments );
        System.out.println("total interst paid is "+ totalInterest);
        input.close();





    }

}

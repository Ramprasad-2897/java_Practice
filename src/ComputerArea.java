import java.util.Scanner;

public class ComputerArea {
    public static void  main(String[]args){
        Scanner input = new Scanner(System.in); // Create a Scanner object for input

        double area;
                      System.out.println("Enter the Radius");//asign radius
        double radiusGiven  = input.nextDouble();        //asign area
        area = 3.14 * radiusGiven * radiusGiven;
        //display the area
        System.out.println("The area of the circle is "  +area);
        input.close();

    }
}


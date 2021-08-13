
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        boolean done = false;
        while (!done) {
            System.out.println("Welcome to the CLI Calculator");
            System.out.println("_____________________________");


            System.out.println("1: for Addition");
            System.out.println("2: for Subtraction");
            System.out.println("3: for Multiplication");
            System.out.println("4: for Division");
            System.out.println("5: for Exit");
            Scanner latAng = new Scanner(System.in);
            System.out.println("Choose your operation:");
            int reneLat = latAng.nextInt();
            double angRene = 0;
            double lar = 0;


            if (reneLat != 5) {
                System.out.println("Enter the first number: ");
                angRene = latAng.nextFloat();
                System.out.println("Enter the second number: ");
                lar = latAng.nextFloat();
            }
            switch (reneLat) {
                case 1:
                    double operator = angRene + lar;
                    System.out.println("your answer is: " + (int) operator);
                    break;
                case 2:
                    double operator2 = angRene - lar;
                    System.out.println("your answer is: " + (int) operator2);
                    break;
                case 3:
                    double operator3 = angRene * lar;
                    System.out.println("your answer is: " + (int)operator3);
                    break;
                case 4:
                    double operator4 = angRene / lar;
                    if (lar == 0)
                        System.out.println("CANNOT DIVIDE BY ZERO");
                    if (lar!= 0)
                        System.out.println("your answer is: " +  " " + String.format("%.2f",operator4));
                        break;
                 case 5:
                //The program will run until the user chooses to exit
                System.out.println("Goodbye!");
                System.exit(0);
        }
    }
}
}


package Job.Job_3;

import java.util.Scanner;

public class FindTheRootOfQuadraticEquation {
    public static void main(String[] args) {
        // Create a Scanner obj for scan user input.
        Scanner scanner = new Scanner(System.in);
        // say user for input a, b, c of eqation.
        System.out.println("Enter a, b, c of eqation one by one: ");
        // Get input a, b, c.
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        // Close the scanner obj
        scanner.close();
        // Calculate D
        double d = b * b - 4 * a * c;
        // Here is the logic
        if (d < 0) System.out.println("Roots are imaginary.");
        else if (d == 0){
           double x1 = (-b - Math.sqrt(d)) / (2 * a);
           double x2 = (-b + Math.sqrt(d)) / (2 * a);
           System.out.println("Roots are x1 = " + x1 + " , x2 = " + x2);
        } else {
            double x = -b / (2 * a);
            System.out.println("Root is x = " + x);
        }
    }
}

package Job.Job_3;

import java.util.Scanner;

public class CalculateAreaOfTriangle {
    public static void main(String[] args) {
        // Create a Scanner obj for scan user input.
        Scanner scanner = new Scanner(System.in);
        // say user for input 3 arms of triangle.
        System.out.println("Enter 3 arms of triangle one by one: ");
        // Get input of arms of triangle.
        double arm1 = scanner.nextDouble();
        double arm2 = scanner.nextDouble();
        double arm3 = scanner.nextDouble();
        // Close the scanner obj.
        scanner.close();
        // Here is the Logic
        if (arm1 + arm2 > arm3 && arm1 + arm3 > arm2 && arm2 + arm3 > arm1){
            // Calculate half of Boundary.
            double s = (arm1 + arm2 + arm3) / 2;
            // Calculate the area.
            double area = Math.sqrt(s * (s - arm1) * (s - arm2) * (s - arm3));
            // print the area.
            System.out.println("Area of triangle: " + area);
        } else {
            System.out.println("Triangle is impossible by arms:" + arm1 + "," + arm2 + "," + arm3);
        }
    }
}

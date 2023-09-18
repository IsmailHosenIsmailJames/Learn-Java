package Job.Job_2;

import java.util.Scanner;

public class CelsiousToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner obj for scan user input.
        Scanner scanner = new Scanner(System.in);
        // say user for input temperature in Celsious.
        System.out.print("Enter temperature in Celsious : ");
        // Get input the value in Celsious.
        float celsious = scanner.nextFloat();
        // Close the scanner obj
        scanner.close();
        // convert Celsious to Celsious.
        float fahrenheit = celsious * 1.8f + 32;
        // print the result in console
        System.out.println(celsious + " Celsious = " + fahrenheit + " Fahrenheit");
    }
}

package Job.Job_1;

import java.util.Scanner;

public class FahrenheitToCelsious {
    public static void main(String[] args) {
        // Create a Scanner obj for scan user input.
        Scanner scanner = new Scanner(System.in);
        // say user for input temperature in fahrenheit.
        System.out.print("Enter temperature in fahrenheit : ");
        // Get input the value in Fahrenheit.
        float fahrenheit = scanner.nextFloat();
        // Close the scanner obj
        scanner.close();
        // convert Fahrenheit to Celsious.
        float celsious = ((fahrenheit - 32) * 5) / 9;
        // print the result in console
        System.out.println(fahrenheit + " fahrenheit = " + celsious + " celsious");
    }
}

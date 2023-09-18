package Job.Job_1;

import java.util.Scanner;

public class MaxInThreeNumber {
    public static void main(String[] args) {
        // Create a Scanner obj for scan user input.
        Scanner scanner = new Scanner(System.in);
        // say user for input three number one by one.
        System.out.println("Enter three number one by one: ");
        // Get input the value in Celsious.
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();
        // Close the scanner obj
        scanner.close();
        float max;
        if (x > y && x > z) max = x;
        else if (y > x && y > z) max = y;
        else max = z;
        // print the result in console
        System.out.println("Max number is : " + max);
    }
}
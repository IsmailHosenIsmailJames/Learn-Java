package basic.operator;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // Define two integer operands
        int operand1 = 10;
        int operand2 = 5;

        // Addition operator (+): Adds operand1 and operand2
        int sum = operand1 + operand2; // 10 + 5 = 15
        System.out.println("Sum: " + sum);

        // Subtraction operator (-): Subtracts operand2 from operand1
        int difference = operand1 - operand2; // 10 - 5 = 5
        System.out.println("Difference: " + difference);

        // Multiplication operator (*): Multiplies operand1 and operand2
        int product = operand1 * operand2; // 10 * 5 = 50
        System.out.println("Product: " + product);

        // Division operator (/): Divides operand1 by operand2
        int quotient = operand1 / operand2; // 10 / 5 = 2
        System.out.println("Quotient: " + quotient);

        // Modulus operator (%): Computes the remainder of operand1 divided by operand2
        int remainder = operand1 % operand2; // 10 % 5 = 0
        System.out.println("Remainder: " + remainder);

        /*
         * Explaination : 

         * 1. We declare two integer variables, operand1 and operand2, and initialize them with the values 10 and 5, respectively.
         * 2. We use the addition operator + to add operand1 and operand2, resulting in the sum variable, which stores the value 15.
         * 3. We use the subtraction operator - to subtract operand2 from operand1, resulting in the difference variable, which stores the value 5.
         * 4. We use the multiplication operator * to multiply operand1 and operand2, resulting in the product variable, which stores the value 50.
         * 6. We use the division operator / to divide operand1 by operand2, resulting in the quotient variable, which stores the value 2. Note that integer division truncates any fractional part.
         * 7. We use the modulus operator % to find the remainder when operand1 is divided by operand2, resulting in the remainder variable, which stores the value 0 because 10 is evenly divisible by 5.
         * 8. Finally, we print the results of these arithmetic operations to the console using System.out.println() statements.
         */

    }
}

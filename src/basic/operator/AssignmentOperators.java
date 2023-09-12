package basic.operator;


public class AssignmentOperators {
    public static void main(String[] args) {
        // Define two integer variables
        int operand1 = 10;
        int operand2 = 5;

        // Assignment operator (=): Assigns the value of the right operand to the left operand
        int result1 = operand1; // result1 is now 10
        System.out.println("Assignment (=) Operator: " + result1);

        // Addition assignment operator (+=): Adds the right operand to the left operand and assigns the result to the left operand
        operand1 += operand2; // Equivalent to: operand1 = operand1 + operand2
        System.out.println("Addition Assignment (+=) Operator: " + operand1);

        // Subtraction assignment operator (-=): Subtracts the right operand from the left operand and assigns the result to the left operand
        operand1 -= operand2; // Equivalent to: operand1 = operand1 - operand2
        System.out.println("Subtraction Assignment (-=) Operator: " + operand1);

        // Multiplication assignment operator (*=): Multiplies the left operand by the right operand and assigns the result to the left operand
        operand1 *= operand2; // Equivalent to: operand1 = operand1 * operand2
        System.out.println("Multiplication Assignment (*=) Operator: " + operand1);

        // Division assignment operator (/=): Divides the left operand by the right operand and assigns the result to the left operand
        operand1 /= operand2; // Equivalent to: operand1 = operand1 / operand2
        System.out.println("Division Assignment (/=) Operator: " + operand1);

        // Modulus assignment operator (%=): Computes the remainder of the division of the left operand by the right operand and assigns the result to the left operand
        operand1 %= operand2; // Equivalent to: operand1 = operand1 % operand2
        System.out.println("Modulus Assignment (%=) Operator: " + operand1);
        /*
         * Explaination : 
         * 
         * 1. We declare two integer variables, `operand1` and `operand2`, and initialize them with the values 10 and 5, respectively.
         * 2. Assignment operator `=`: Assigns the value of the right operand to the left operand. In the example, `result1` is assigned the value of `operand1`, which is 10.
         * 3. Addition assignment operator `+=`: Adds the right operand to the left operand and assigns the result back to the left operand. It is equivalent to `operand1 = operand1 + operand2`. After this operation, `operand1` becomes 15.
         * 4. Subtraction assignment operator `-=`: Subtracts the right operand from the left operand and assigns the result back to the left operand. It is equivalent to `operand1 = operand1 - operand2`. After this operation, `operand1` becomes 10 again.
         * 5. Multiplication assignment operator `*=`: Multiplies the left operand by the right operand and assigns the result back to the left operand. It is equivalent to `operand1 = operand1 * operand2`. After this operation, `operand1` becomes 50.
         * 6. Division assignment operator `/=`: Divides the left operand by the right operand and assigns the result back to the left operand. It is equivalent to `operand1 = operand1 / operand2`. After this operation, `operand1` becomes 10 again.
         * 7. Modulus assignment operator `%=`: Computes the remainder of the division of the left operand by the right operand and assigns the result back to the left operand. It is equivalent to `operand1 = operand1 % operand2`. After this operation, `operand1` becomes 0.
         * 8. We print the results of these assignment operations to the console using `System.out.println()` statements.
         */
    }
}
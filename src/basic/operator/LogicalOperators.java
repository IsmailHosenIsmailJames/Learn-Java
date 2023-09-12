package basic.operator;

public class LogicalOperators {
    public static void main(String[] args) {
        // Define two boolean operands
        boolean operand1 = true;
        boolean operand2 = false;

        // Logical AND operator (&&): Returns true if both operands are true
        boolean result1 = operand1 && operand2; // true AND false is false
        System.out.println("Logical AND: " + result1);

        // Logical OR operator (||): Returns true if at least one operand is true
        boolean result2 = operand1 || operand2; // true OR false is true
        System.out.println("Logical OR: " + result2);

        // Logical NOT operator (!): Negates the value of the operand
        boolean result3 = !operand1; // Negating true results in false
        boolean result4 = !operand2; // Negating false results in true
        System.out.println("Logical NOT (operand1): " + result3);
        System.out.println("Logical NOT (operand2): " + result4);

        // Complex expressions with logical operators
        boolean complexExpression = (operand1 && (operand2 || result3)) && !result4;
        // (true && (false || false)) && true = (true && false) && true = false && true = false
        System.out.println("Complex Expression: " + complexExpression);

        /*
         * Explaination : 

         * 1. We declare two boolean variables, operand1 and operand2, and initialize them with the values true and false, respectively.
         * 2. We use the logical AND operator && to check if both operand1 and operand2 are true. Since operand1 is true and operand2 is false, the result of operand1 && operand2 is false.
         * 3. We use the logical OR operator || to check if at least one of operand1 or operand2 is true. Since operand1 is true (even though operand2 is false), the result of operand1 || operand2 is true.
         * 4. We use the logical NOT operator ! to negate the value of operand1 and operand2. So, !operand1 is false because it negates true, and !operand2 is true because it negates false.
         * 5. We demonstrate complex expressions by combining these logical operators. In the complexExpression variable, we use parentheses to ensure the correct order of evaluation. We evaluate (operand1 && (operand2 || result3)) && !result4. Here, operand1 && (operand2 || result3) evaluates to false, and then false && !result4 evaluates to false.
         * 6. Finally, we print the results of these logical operations to the console using System.out.println() statements
         */
    }
}

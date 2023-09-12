package basic.operator;

/*
 *  The conditional operator in Java, often referred to as the ternary operator, is a concise way to express conditional expressions. It has the following syntax:
 *
 *  condition ? expression1 : expression2
 */


public class ConditionalOperator {
    public static void main(String[] args) {
        // Define two integer variables
        int number1 = 10;
        int number2 = 5;

        // Conditional (Ternary) Operator: (condition ? expression1 : expression2)
        // If the condition is true, expression1 is evaluated; otherwise, expression2 is evaluated.

        // Example 1: Using the ternary operator to find the maximum of two numbers
        int maxNumber = (number1 > number2) ? number1 : number2; // condition is true, so maxNumber = number1
        System.out.println("Maximum Number: " + maxNumber);

        // Example 2: Using the ternary operator to assign a message based on a condition
        String message = (number1 > number2) ? "Number1 is greater" : "Number2 is greater"; // condition is true, so message = "Number1 is greater"
        System.out.println("Message: " + message);

        // Example 3: Nested ternary operators for more complex conditions
        int a = 5;
        int b = 10;
        int c = 15;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        // The outer ternary operator checks if a > b (false), so it goes to the second expression (the one after ":")
        // The inner ternary operator then checks if b > c (false), so it selects c as the maximum value.
        System.out.println("Maximum of a, b, and c: " + max);

        /*
         * Explaination : 
         * 
         * 1. We define two integer variables, `number1` and `number2`, and initialize them with the values 10 and 5, respectively.
         * 2. We use the conditional (ternary) operator to perform conditional evaluations and assign values based on the conditions.
         * 3. Example 1 demonstrates finding the maximum of two numbers using the ternary operator. If `number1` is greater than `number2`, it assigns the value of `number1` to `maxNumber`; otherwise, it assigns the value of `number2`.
         * 4. Example 2 shows using the ternary operator to assign a message based on a condition. If `number1` is greater than `number2`, it assigns one message; otherwise, it assigns another message.
         * 5. Example 3 illustrates how you can use nested ternary operators to handle more complex conditions. In this case, it finds the maximum of three numbers (`a`, `b`, and `c`) using nested ternary operators.
         * The ternary operator is useful for simplifying conditional assignments and expressions, especially when you have simple conditions with two possible outcomes.
         */
    }
}

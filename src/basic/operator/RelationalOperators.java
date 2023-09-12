package basic.operator;

public class RelationalOperators {
    public static void main(String[] args) {
        // Define two integer operands
        int operand1 = 10;
        int operand2 = 5;

        // Equal to operator (==): Checks if operand1 is equal to operand2
        boolean isEqual = operand1 == operand2; // 10 is not equal to 5, so isEqual is false
        System.out.println("Is Equal: " + isEqual);

        // Not equal to operator (!=): Checks if operand1 is not equal to operand2
        boolean isNotEqual = operand1 != operand2; // 10 is not equal to 5, so isNotEqual is true
        System.out.println("Is Not Equal: " + isNotEqual);

        // Less than operator (<): Checks if operand1 is less than operand2
        boolean isLessThan = operand1 < operand2; // 10 is not less than 5, so isLessThan is false
        System.out.println("Is Less Than: " + isLessThan);

        // Greater than operator (>): Checks if operand1 is greater than operand2
        boolean isGreaterThan = operand1 > operand2; // 10 is greater than 5, so isGreaterThan is true
        System.out.println("Is Greater Than: " + isGreaterThan);

        // Less than or equal to operator (<=): Checks if operand1 is less than or equal
        // to operand2
        boolean isLessThanOrEqual = operand1 <= operand2; // 10 is not less than or equal to 5, so isLessThanOrEqual is
                                                          // false
        System.out.println("Is Less Than or Equal To: " + isLessThanOrEqual);

        // Greater than or equal to operator (>=): Checks if operand1 is greater than or
        // equal to operand2
        boolean isGreaterThanOrEqual = operand1 >= operand2; // 10 is greater than or equal to 5, so
                                                             // isGreaterThanOrEqual is true
        System.out.println("Is Greater Than or Equal To: " + isGreaterThanOrEqual);

        /*
         * Explaination : 

         * 1. We declare two integer variables, operand1 and operand2, and initialize them with the values 10 and 5, respectively.
         * 2. We use the equal to operator == to check if operand1 is equal to operand2. Since 10 is not equal to 5, the isEqual variable is assigned the value false.
         * 3. We use the not equal to operator != to check if operand1 is not equal to operand2. Since 10 is not equal to 5, the isNotEqual variable is assigned the value true.
         * 4. We use the less than operator < to check if operand1 is less than operand2. Since 10 is not less than 5, the isLessThan variable is assigned the value false.
         * 5. We use the greater than operator > to check if operand1 is greater than operand2. Since 10 is greater than 5, the isGreaterThan variable is assigned the value true.
         * 6. We use the less than or equal to operator <= to check if operand1 is less than or equal to operand2. Since 10 is neither less than nor equal to 5, the isLessThanOrEqual variable is assigned the value false.
         * 7. We use the greater than or equal to operator >= to check if operand1 is greater than or equal to operand2. Since 10 is greater than or equal to 5, the isGreaterThanOrEqual variable is assigned the value true.
         * 8. Finally, we print the results of these relational operations to the console using System.out.println() statements.
         */

    }

}

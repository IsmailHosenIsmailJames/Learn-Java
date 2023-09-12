package basic.operator;

public class BitwiseOperators {
    public static void main(String[] args) {
        // Define two integer operands
        int operand1 = 5;    // binary: 0101
        int operand2 = 3;    // binary: 0011

        // Bitwise AND operator (&): Performs a bitwise AND operation on each pair of bits
        int result1 = operand1 & operand2; // binary: 0001 (1 in decimal)
        System.out.println("Bitwise AND: " + result1);

        // Bitwise OR operator (|): Performs a bitwise OR operation on each pair of bits
        int result2 = operand1 | operand2; // binary: 0111 (7 in decimal)
        System.out.println("Bitwise OR: " + result2);

        // Bitwise XOR operator (^): Performs a bitwise XOR (exclusive OR) operation on each pair of bits
        int result3 = operand1 ^ operand2; // binary: 0110 (6 in decimal)
        System.out.println("Bitwise XOR: " + result3);

        // Bitwise NOT operator (~): Flips each bit (0 to 1 and 1 to 0)
        int result4 = ~operand1; // binary: 11111111111111111111111111111010 (-6 in decimal)
        System.out.println("Bitwise NOT (operand1): " + result4);

        // Left Shift operator (<<): Shifts the bits of the left operand to the left by the number of positions specified by the right operand
        int result5 = operand1 << 2; // binary: 010100 (20 in decimal)
        System.out.println("Left Shift: " + result5);

        // Right Shift operator (>>): Shifts the bits of the left operand to the right by the number of positions specified by the right operand (sign-extended)
        int result6 = operand1 >> 1; // binary: 0010 (2 in decimal)
        System.out.println("Right Shift: " + result6);

        // Unsigned Right Shift operator (>>>): Similar to >>, but fills the leftmost bits with 0 (zero-extended)
        int result7 = operand1 >>> 1; // binary: 0001 (1 in decimal)
        System.out.println("Unsigned Right Shift: " + result7);

        /*
         * Explaination : 

         * 1. We declare two integer variables, `operand1` and `operand2`, and initialize them with the values 5 and 3, respectively. We also represent their binary equivalents in comments.
         * 2. Bitwise AND (`&`) operator: Performs a bitwise AND operation on each pair of bits. In the binary representation, it sets a bit to 1 if both corresponding bits are 1.
         * 3. Bitwise OR (`|`) operator: Performs a bitwise OR operation on each pair of bits. In the binary representation, it sets a bit to 1 if at least one of the corresponding bits is 1.
         * 4. Bitwise XOR (`^`) operator: Performs a bitwise XOR (exclusive OR) operation on each pair of bits. In the binary representation, it sets a bit to 1 if the corresponding bits are different.
         * 5. Bitwise NOT (`~`) operator: Flips each bit (0 to 1 and 1 to 0) in the operand.
         * 6. Left Shift (`<<`) operator: Shifts the bits of the left operand to the left by the number of positions specified by the right operand.
         * 7. Right Shift (`>>`) operator: Shifts the bits of the left operand to the right by the number of positions specified by the right operand. It is sign-extended, meaning the leftmost bit (sign bit) is filled with the sign bit of the original number.
         * 8. Unsigned Right Shift (`>>>`) operator: Similar to `>>`, but it fills the leftmost bits with 0 (zero-extended) instead of the sign bit.
         * 9. We then print the results of these bitwise operations to the console using `System.out.println()` statements.
         */
    }
}
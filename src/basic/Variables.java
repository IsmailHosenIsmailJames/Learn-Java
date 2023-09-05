/*
The "package" statement in Java is used to organize classes into a package or namespace.
Packages are used to group related classes and provide a hierarchical structure to the codebase.

In this specific line, "package basic;" is declaring that the current Java file belongs to a package named "basic".
Packages are typically used to group related classes together and avoid naming conflicts with classes in other packages.

For example, if you have multiple classes related to basic functionality in your project,
you can place them in the "basic" package to keep them organized and separate from classes in other packages.

Packages also help in controlling access to classes and provide a way to create more modular and maintainable code.
By using packages, you can organize your codebase into logical units, making it easier to manage and understand.

Note that the package declaration must be the first statement in a Java file (if it exists), before any imports or class declarations.
*/
package basic;

public class Variables {
    public static void main(String[] args) {
        // Declare and initialize a boolean variable with the value 'true'
        boolean bool_x = true;

        // Declare and initialize a byte variable with the maximum value it can hold (2^7 - 1)
        // Byte: 8 bits, Range: -128 to 127
        byte byte_num = 127;

        // Declare and initialize a char variable with the maximum value it can hold (2^16 - 1)
        // Char: 16 bits, Range: 0 to 65,535
        char char_num = 65535;

        // Declare and initialize a short variable with the maximum value it can hold (2^15 - 1)
        // Short: 16 bits, Range: -32,768 to 32,767
        short short_num = 32767;

        // Declare and initialize an integer variable with the maximum value it can hold (2^31 - 1)
        // Int: 32 bits, Range: -2,147,483,648 to 2,147,483,647
        int int_num = 2147483647;

        // Declare and initialize a long variable with the maximum value it can hold (2^63 - 1)
        // Long: 64 bits, Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long long_num = 9223372036854775807L;

        // Declare and initialize a float variable with a large positive value using scientific notation
        // Float: 32 bits, Precision: ~7 decimal places
        float float_num = 3.4028235E38f;

        // Declare and initialize a double variable with a large positive value using scientific notation
        // Double: 64 bits, Precision: ~15 decimal places
        double double_num = 1.7976931348623157E308d;

        // Declare and initialize a string variable;
        String name = "Hello World!";
        
        System.out.println("bool_x is boolean" + bool_x);
        System.out.println("byte_num is byte" + byte_num);
        System.out.println("char_num is char" + char_num);
        System.out.println("short_num is short" + short_num);
        System.out.println("int_num is int" + int_num);
        System.out.println("long_num is long" + long_num);
        System.out.println("float_num is float" + float_num);
        System.out.println("double_num is double" + double_num);
        System.out.println("name is string" + name);
    }
}

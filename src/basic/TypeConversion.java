package basic;

public class TypeConversion {

    public static void main(String[] args) {
        // Converting byte to int
        byte byteValue = 42;
        int intValueFromByte = byteValue;

        System.out.println("byte to int: " + intValueFromByte);

        // Converting int to byte (may require explicit casting)
        int intValue = 100;
        byte byteValueFromInt = (byte) intValue;

        System.out.println("int to byte: " + byteValueFromInt);

        // Converting short to int
        short shortValue = 500;
        int intValueFromShort = shortValue;

        System.out.println("short to int: " + intValueFromShort);

        // Converting int to short (may require explicit casting)
        int intValue2 = 1000;
        short shortValueFromInt = (short) intValue2;

        System.out.println("int to short: " + shortValueFromInt);

        // Converting double to int (may lose decimal part)
        double doubleValue = 123.456;
        int intValueFromDouble = (int) doubleValue;

        System.out.println("double to int: " + intValueFromDouble);

        // Converting int to double
        int intValue3 = 789;
        double doubleValueFromInt = intValue3;

        System.out.println("int to double: " + doubleValueFromInt);

        // Converting float to double
        float floatValue = 3.14f;
        double doubleValueFromFloat = floatValue;

        System.out.println("float to double: " + doubleValueFromFloat);

        // Converting double to float (may lose precision)
        double doubleValue2 = 987.654;
        float floatValueFromDouble = (float) doubleValue2;

        System.out.println("double to float: " + floatValueFromDouble);

        // Converting char to int
        char charValue = 'A';
        int intValueFromChar = charValue;

        System.out.println("char to int: " + intValueFromChar);

        // Converting int to char (may require explicit casting)
        int intValue4 = 65; // ASCII value for 'A'
        char charValueFromInt = (char) intValue4;

        System.out.println("int to char: " + charValueFromInt);
    }
}

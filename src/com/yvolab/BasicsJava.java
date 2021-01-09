package com.yvolab;

import java.util.Scanner;

public class BasicsJava {
    public static void printDayOfTheWeek(int day) {
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    public static String functions(String name, int age) {
        return String.format("Hello %s you are %d years old", name, age);

    }

    static void operatorsChallenge() {
        double num1 = 20.00d;
        double num2 = 80.00d;
        double result = ((num1 + num2) * 100d) % 40.00d;
        boolean isTrue = (result == 0) ? true : false;
        System.out.println(isTrue);

        if (!isTrue)
            System.out.println("Got some reminder");
        else
            System.out.println("No remainder");
    }

    static void booleanFunc() {
        System.out.print("Enter Age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean isAdult = age >= 18;
        boolean excempt = false;

        if (isAdult || excempt)
            System.out.println("Age Confirmed, please continue");
        else
            System.out.println("Only adults can view this content");
    }

    static void stringClass() {
        String message = " Hello World !! ";
        System.out.println(message.trim());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim() + " \u00A9 2020");
    }

    static void primitiveTypes() {
        byte byteMaxValue = Byte.MAX_VALUE;
        byte byteMinValue = Byte.MIN_VALUE;
        byte byteNum = 127;
        System.out.println("Byte Max " + byteMaxValue);
        System.out.println("Byte Min " + byteMinValue);

        short shortMaxValue = Short.MAX_VALUE;
        short shortMinValue = Short.MIN_VALUE;
        short shortNum = 32767;
        System.out.println("Short Max " + shortMaxValue);
        System.out.println("Short Min " + shortMinValue);

        int intMaxValue = Integer.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;
        int intNum = 2147483647;
        System.out.println("Int Max " + intMaxValue);
        System.out.println("Int Min " + intMinValue);
        System.out.println("Busted/Overflow int Min " + (intMinValue + 1));
        System.out.println("Busted/Underflow int Min " + (intMinValue - 1));

        long longMaxValue = Long.MAX_VALUE;
        long longMinValue = Long.MIN_VALUE;
        long longNum = 9223372036854775807L;
        System.out.println("Long Max " + longMaxValue);
        System.out.println("Long Min " + longMinValue);

        float floatMaxValue = Float.MAX_VALUE;
        float floatMinValue = Float.MIN_VALUE;
        float floatNum = 3.4028235E38F;
        System.out.println("Float Max " + floatMaxValue);
        System.out.println("Float Min " + floatMinValue);

        double doubleMaxVal = Double.MAX_VALUE;
        double doubleMinVal = Double.MIN_VALUE;
        double doubleNum = 1.7976931348623157E308;
        System.out.println("Double Max " + doubleMaxVal);
        System.out.println("Double Min " + doubleMinVal);

        char myChar = 'H';
        char myUnicodeChar = '\u0048';
        char otherUnicodeFarsi = '\u0634';
        char otherUnicodeCopySymbol = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(otherUnicodeFarsi);
        System.out.println(otherUnicodeCopySymbol);
        //UNICODE-REF: https://unicode-table.com/en/#basic-latin

        int age = 22;
        boolean isAdult = age > 18;
        System.out.println(isAdult);

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        //Integers can be used to store very large numbers.
        int myValue = 10000;

        //Integers have a limit with the max and min numbers.
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        //If the integer exceeds this limit, the program runs out of memory and overflows,
        //causing an incorrect value to be printed.
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        //Commas can be used to separate numbers to make large values more readable.
        int myMaxIntTest = 2_147_483_647;

        //Bytes can be used to store very small numbers.
        //They're typically used for printing a series of numbers within that specific small range.
        byte myMinByteValue  = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        //Shorts store VERY small values.
        short myMinShortValue  = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        //Longs store values with a width of 64,
        //2x the width of an int.
        long myLongValue = 100L;
        long myMinLongValue  = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        //Use casting to transform values.
        //Literal values in parentheses default to integers, so Java needs to be told,
        //to make the value a byte.
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        //Usually, you should always use integers.

    }
}

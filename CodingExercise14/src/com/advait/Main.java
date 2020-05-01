package com.advait;

public class Main {

    public static boolean isOdd(int number) {

        if (number < 0) {

            return false;

        } else return number % 2 != 0;

    }


    public static int sumOdd(int start, int end) {


        int x = 0;

        if (start > end || start < 0) {

            return -1;

        } else {

            for (int i = start; i <= end; i++) {

                if (isOdd(i)) {

                    x += i;


                }


            }

        }

        return x;

    }

}
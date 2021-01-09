package com.yvolab;

public class MyUtils {
    public static float toTwoDecimal(double number) {
        return Math.round(number * 100.00f) / 100.00f;
    }
}

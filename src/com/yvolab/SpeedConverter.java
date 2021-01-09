package com.yvolab;

public class SpeedConverter {
    private static  final double ONE_MILE_IN_KILOMETER = 1.609d;

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
            return;
        }

        String result = String.format("%s km/h = %s mi/h", kilometersPerHour, milesPerHour);
        System.out.println(result);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;

        long result = Math.round(kilometersPerHour / ONE_MILE_IN_KILOMETER);
        return result;
    }



}

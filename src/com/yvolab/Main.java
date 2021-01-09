package com.yvolab;

public class Main {

    public static void main(String[] args) {

        try {
            int day = Integer.parseInt("11d");
            System.out.println(day);
        } catch (Exception e) {
            System.out.println("Something went wrong,Invalid input");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }


}

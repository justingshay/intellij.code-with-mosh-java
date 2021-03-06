package com.jshay.code_with_mosh.lectures.part1_2;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt){

        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, int min, int max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value greater than " + min + " and less than " + max);
        }
        System.out.println(value);
        return value;
    }
}

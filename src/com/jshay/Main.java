package com.jshay;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //NumberFormat.getCurrencyInstance().format(variable);
        Scanner scanner = new Scanner(System.in);
        /* ~~~~~~~~~~ Mortgage Calculator v1 ~~~~~~~~~~
               r(1+r)^n
        M = P*------------
               (1+r)^n -1
        P is the Principal
        r is monthly interest rate, calculated by annual rate / 12
        n is number of payments (number of months will be paying loan)
        */
        /*
        System.out.print("Enter your Principal: ");
        int prin = scanner.nextInt();
        System.out.print("Enter your Annual Interest Rate: ");
        double rate = (scanner.nextDouble()/100)/12;
        System.out.print("Enter your loan length (years): ");
        int months = scanner.nextInt() * 12;
        double payment = prin * ((rate*Math.pow((1+rate),months))/(Math.pow((1+rate),months)-1));
        System.out.println(NumberFormat.getCurrencyInstance().format(payment));
         ~~~~~~~~~~~ end Mortgage Calculator v1 ~~~~~~~~~~ */

        /* ~~~~~~~~~~ Ternary Operator ( ? : ) ~~~~~~~~~~
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy"; //true will result in First, false will result in Economy
        ~~~~~~~~~~ end Ternary Operator ~~~~~~~~~~ */

        /* ~~~~~~~~~~FizzBuzz~~~~~~~~~~
        num % 5 = 0 //print Fizz
        num % 3 = 0 //print Buzz
        num % 5 = 0 && num % 3 = 0 //print FizzBuzz
        */
        /*
        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();
        if(number%5==0 && number%3==0)
            System.out.println("FizzBuzz");
        else if (number%5==0)
            System.out.println("Fizz");
        else if (number%3==0)
            System.out.println("Buzz");
        else
            System.out.println("Number is not divisible by 5 or 3.");
         ~~~~~~~~~~ end FizzBuzz ~~~~~~~~~~ */

        /* ~~~~~~~~~~For each loop ~~~~~~~~~~
        Array fruits = {"Apple","Banana","Orange"};
        for (String fruit : fruits)
            System.out.println(fruit);
         ~~~~~~~~~~ end For each loop ~~~~~~~~~~*/

        /* ~~~~~~~~~~~~~~Mortgage Calculator v2 (w/ Validation)~~~~~~~~~~~~~~~~~~
        Principal btwn 1K - 1M
        Annual Interest Rate btwn 0 - 30
        Period (Years) btwn 0 - 30

        //Calculating Mortgage payments
               r(1+r)^n
        M = P*------------
               (1+r)^n -1
        P is the Principal
        r is monthly interest rate, calculated by annual rate / 12
        n is number of payments (number of months will be paying loan)
        */
        /*
        final int percent = 100;
        final int months_In_Year = 12;

        int principal = 0;
        while(true){
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Principal must be greater than 1,000 and less than 1,000,000.");
        }

        float annualRate = 0;
        while(true){
            System.out.print("Annual Interest Rate: ");
            annualRate = scanner.nextFloat();
            if(annualRate > 0 && annualRate <= 30)
                break;
            System.out.println("Annual Interest Rate must be greater than 0 and less than 30.");
        }
        double rate = (annualRate / percent) / months_In_Year;

        int years = 0;
        while(true){
            System.out.print("Period (Years): ");
            years = scanner.nextInt();
            if(years > 0 && years <= 30)
                break;
            System.out.println("Period must be greater than 0 and less than 30.");
        }

        int numPayments = years * months_In_Year;
        double mortgage = principal * ( (rate*Math.pow(1+rate, numPayments)) / (Math.pow(1+rate, numPayments) -1 ) );
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your mortgage payment is: " + mortgageFormatted);
        ~~~~~~~~~~ end Mortgage Calculator v2 ~~~~~~~~~~ */

    }
}

package com.jshay;

import org.w3c.dom.Text;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //NumberFormat.getCurrencyInstance().format(variable);
        //Scanner scanner = new Scanner(System.in);
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
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest: ", 1, 30);
        byte years = (byte) readNumber("Period (in Years)",1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your mortgage payment is: " + mortgageFormatted);
        paymentSchedule(principal, annualInterest, years);
         */
        //~~~~~~~~~~ end Mortgage Calculator v2 ~~~~~~~~~~

        //~~~~~~~ Coding with Mosh - Ultimate Java 2 ~~~~~~~
        //Creating Objects
        /*
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
         */

        //Encapsulation
        //Abstraction - Reduce complexity by hiding unnecessary details
        //Coupling - the level of dependency between classes
        //Constructors
        //Method Overloading
        //Static Members
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(NumberFormat.getCurrencyInstance().format(wage));


        //Reducing Coupling
        /*
        Browser browser = new Browser();
        browser.navigate("");
         */




    }

    public static double readNumber(String prompt, int min, int max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value = scanner.nextDouble();
            if(value >= min && value <= max)
                break;
            System.out.println("Enter a value greater than " + min + " and less than " + max);
        }
        System.out.println(value);
        return value;
    }

    public static double calculateMortgage(int principal, float annualInterest, byte years){
        /*Calculating Mortgage payments
                r(1+r)^n
        M = P*------------
               (1+r)^n -1
        P is the Principal
        r is monthly interest rate, calculated by annual rate / 12
        n is number of payments (number of months will be paying loan)
        */
        final int percent = 100;
        final int months_In_Year = 12;

        double monthlyInterest = (annualInterest / percent) / months_In_Year;
        System.out.println(monthlyInterest);
        int numPayments = years * months_In_Year;
        System.out.println(numPayments);

        double mortgage = principal * ( (monthlyInterest *Math.pow(1 +  monthlyInterest, numPayments)) / (Math.pow(1 + monthlyInterest, numPayments) -1 ) );
        System.out.println(mortgage);
        return mortgage;
    }

    public static void paymentSchedule(int principal, float annualInterest, byte years){
        final int percent = 100;
        final int months_In_Years = 12;

        double remainingBalance;
        int numPayments = years * months_In_Years;
        double monthlyInterest = annualInterest / percent / months_In_Years;

        System.out.println("Monthly Payment Schedule: ");
        for(int i = 1; i <= numPayments; i++){
            remainingBalance = principal * ((Math.pow(1 + monthlyInterest, numPayments)-Math.pow(1+monthlyInterest, i))/
                    (Math.pow(1+ monthlyInterest, numPayments)-1));
            String remainBalanceFormatted = NumberFormat.getCurrencyInstance().format(remainingBalance);
            System.out.println(i + ": " + remainBalanceFormatted);
        }

    }
}

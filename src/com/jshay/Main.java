package com.jshay;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

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
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (in Years)",1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();
        */
        //~~~~~~~~~~ end Mortgage Calculator v2 ~~~~~~~~~~
        //var con = new UIControl();
        var control = new TextBox();
        var control2 = control;
        var control3 = new TextBox();
        control.disable();
        System.out.println(control.isEnabled());
        System.out.println(control.hashCode());
        System.out.println(control.equals(control2));
        System.out.println(control.equals(control3));
        System.out.println(control.toString());




    }

}

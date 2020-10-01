package com.jshay;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCalculator calculator;
    private final NumberFormat currency = NumberFormat.getCurrencyInstance();

    public MortgageReport(MortgageCalculator calculator){
        this.calculator = calculator;
    }
    public void printMortgage() {
        System.out.println("-- MORTGAGE --");
        double mortgage = calculator.calculateMortgage();
        System.out.println(currency.format(mortgage));
    }

    public void printPaymentSchedule() {

        double[] remainingBalance = calculator.getRemainingBalances();
        System.out.println("-- Monthly Payment Schedule --");
        for (int i = 0; i < remainingBalance.length; i++) {
            System.out.println((i + 1) + ": " + currency.format(remainingBalance[i]));
        }

    }
}

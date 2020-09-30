package com.jshay;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator){
        this.calculator = calculator;
    }

    public void paymentSchedule() {
        System.out.println("Monthly Payment Schedule: ");
        /*
        for(double balance : calculator.getRemainingBalance())
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        */
        for (int i = 1; i <= calculator.getNumPayments(); i++) {
            double remainingBalance = calculator.calculateBalance(i);
            String remainBalanceFormatted = NumberFormat.getCurrencyInstance().format(remainingBalance);
            System.out.println(i + ": " + remainBalanceFormatted);
        }
    }

    public void printMortgage(){
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your mortgage monthly payment is: " + mortgageFormatted);
    }
}

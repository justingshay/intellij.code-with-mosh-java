package com.jshay;

public class MortgageCalculator {

    private final int PERCENT = 100;
    private final int MONTHS_IN_YEAR = 12;

    private int principal;
    private float annualInterest;
    private byte years;

    private double monthlyInterest;
    private int numPayments;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;

        this.monthlyInterest = (annualInterest / this.PERCENT) / this.MONTHS_IN_YEAR;
        this.numPayments = years * this.MONTHS_IN_YEAR;
    }

    public double calculateMortgage() {
        /*Calculating Mortgage payments
                r(1+r)^n
        M = P*------------
               (1+r)^n -1
        P is the Principal
        r is monthly interest rate, calculated by annual rate / 12
        n is number of payments (number of months will be paying loan)
        */

        double mortgage = principal * ((monthlyInterest * Math.pow(1 + monthlyInterest, numPayments)) / (Math.pow(1 + monthlyInterest, numPayments) - 1));
        System.out.println(mortgage);
        return mortgage;
    }

    public double calculateBalance(int month){
        double remainingBalance = this.principal * ((Math.pow(1 + this.monthlyInterest, this.numPayments) - Math.pow(1 + this.monthlyInterest, month)) /
                (Math.pow(1 + this.monthlyInterest, this.numPayments) - 1));

        return remainingBalance;
    }

    public double[] getRemainingBalance(){
        var balances = new double[getNumPayments()];
        for (int i = 1; i <= balances.length; i++)
            balances[i-1] = calculateBalance(i);

        return balances;
    }

    public int getNumPayments(){
        return numPayments;
    }
}

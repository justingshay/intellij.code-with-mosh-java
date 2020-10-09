package com.jshay.code_with_mosh.lectures.part1_2;

public class MortgageCalculator {

    private final byte PERCENT = 100;
    private final byte MONTHS_IN_YEARS = 12;

    private int principal;
    private double monthlyInterest;
    private byte years;
    private int numPayments;

    public MortgageCalculator(int principal, float annualInterest, byte years){
        this.principal = principal;
        this.monthlyInterest = (annualInterest / this.PERCENT) / this.MONTHS_IN_YEARS;
        this.years = years;
        this.numPayments = this.years * this.MONTHS_IN_YEARS;

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
        /*System.out.println(this.principal);
        System.out.println(this.monthlyInterest);
        System.out.println(this.numPayments);*/
        double mortgage = this.principal * ((this.monthlyInterest * Math.pow(1 + this.monthlyInterest, this.numPayments)) / (Math.pow(1 + this.monthlyInterest, this.numPayments) - 1));
        System.out.println(mortgage);
        return mortgage;
    }

    public double calculateBalances(int month) {

        double remainingBalance = principal * ((Math.pow(1 + monthlyInterest, numPayments) - Math.pow(1 + monthlyInterest, month)) /
                (Math.pow(1 + monthlyInterest, numPayments) - 1));

        return remainingBalance;
    }

    public double[] getRemainingBalances(){
        var balances = new double[getNumPayments()];
        for (int i = 1; i <= balances.length; i++) {
            balances[i-1] = calculateBalances(i);
        }
        return balances;
    }

    public int getNumPayments(){
        return this.numPayments;
    }
}

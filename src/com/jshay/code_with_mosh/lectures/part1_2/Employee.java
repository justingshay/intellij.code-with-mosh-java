package com.jshay.code_with_mosh.lectures.part1_2;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    //static field
    public static int numberOfEmployees;
    //static method
    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }

    public Employee(int baseSalary){
        this(baseSalary, 0);
    }
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage(){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return this.baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return this.hourlyRate;
    }


}

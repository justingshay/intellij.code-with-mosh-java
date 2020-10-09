package com.jshay.code_with_mosh.lectures.part1_2;

public class Notes {

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
        /*
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(NumberFormat.getCurrencyInstance().format(wage));
         */

    //Reducing Coupling
        /*
        Browser browser = new Browser();
        browser.navigate("");
         */

    //INHERITANCE
    //OBJECT CLASS
    //CONSTRUCTORS
    //var con = new UIControl();
    /*
    var control = new TextBox();
    var control2 = control;
    var control3 = new TextBox();
    control.disable();
    System.out.println(control.isEnabled());
    System.out.println(control.hashCode());
    System.out.println(control.equals(control2));
    System.out.println(control.equals(control3));
    System.out.println(control.toString());
    */

    //OVERRIDING METHODS
    /*
    //override needs to have the same number of arguments and have the same return value
    @Override
    public String toString(){
        //stuff
    }
     */
    // println method automatically calls the toString() method of any object

    //UPCASTING and DOWNCASTING
    /*
    Upcasting - casting an object to one of its super types
    Downcasting - casting an object to one of its sub types
     */

    //COMPARING OBJECTS
    /*
    var point1 = new Point(1,2);
    var point2 = new Point(1,2);
    System.out.println(point1.equals(point2));
    System.out.println(point1.hashCode());   //false
    System.out.println(point2.hashCode());
     */

    //POLYMORPHISM - means many forms
//    UIControl[] controls = {new TextBox(), new CheckBox()};
//        for(var control : controls){
//        control.render();
//    }
    //ABSTRACT CLASSES and METHODS
    /*
    Abstract classes cannot be initialized but can be extended =~ used as a template
    Abstract classes have no body and must be overridden in the class that extends the abstract class
     */

    //FINAL CLASSES and METHODS
    /*
    Classes declared as final cannot be extended
    Methods declared as final cannot be overridden
     */

    //DEEP INHERITANCE HIERARCHIES
    //avoid inheritance deeper than 3 levels of dependencies

    //MULTIPLE INHERITANCE
    //not supported in Java because of its complexities



    //INTERFACES - used to build loosely-coupled, extensible, testable applications
    /*
        coupling - the level of dependencies between two software entities like classes

        Interfaces are like classes but only include method declarations, no code, no implementation
            - defines capabilities a class should have

        Interfaces define WHAT should be done
        Classes define HOW it should be done
     */

    //CREATING AN INTERFACE
    //DEPENDENCY INJECTION - classes should not instantiate their dependencies
    //CONSTRUCTOR INJECTION
    /*
    var calculator = new TaxCalculator2018(100_000);
    var report = new TaxReport(calculator);
     */

    //SETTER INJECTION
    /*
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
     */

    //METHOD INJECTION
    /*
    public void show(TaxCalculator calculator){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
     */

    //INTERFACE SEGREGATION PRINCIPLE - divide big interfaces into smaller ones
    /*
    separate like capabilities into separate interfaces
    Interfaces can have multiple parents, classes can not
     */

    //Avoid implementing fields in interfaces - are constant (final) and static //cannot be changed except in interface
    

}

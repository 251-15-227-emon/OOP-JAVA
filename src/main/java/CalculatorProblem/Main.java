package CalculatorProblem;

class Calculator {

    // Private instance variables
    private double num1;
    private double num2;

    // Setter methods
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Getter methods
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // Addition
    public double add() {
        return num1 + num2;
    }

    // Subtraction
    public double subtract() {
        return num1 - num2;
    }

    // Multiplication
    public double multiply() {
        return num1 * num2;
    }

    // Division
    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

public class Main {

    public static void main(String[] args) {

        // Association: User uses Calculator
        Calculator calc = new Calculator();

        // Setting values
        calc.setNum1(20);
        calc.setNum2(0);

        System.out.println("Number 1: " + calc.getNum1());
        System.out.println("Number 2: " + calc.getNum2());

        // Performing operations
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());

        try {
            System.out.println("Division: " + calc.divide());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

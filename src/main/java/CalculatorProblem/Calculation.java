package CalculatorProblem;

class Calculator {

    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add() {

        return num1 + num2;

    }

    public double Substract() {

        return num1 - num2;

    }

    public double Multiply() {

        return num1 * num2;

    }

    public double Division() {

        if (num2 == 0) {

            throw new ArithmeticException("Can not Devided by Zero");

        }

        return num1 / num2;

    }

}

public class Calculation {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        c1.setNum1(10.0);
        c1.setNum2(0.0);

        System.out.println("Number 1 :" + c1.getNum1());
        System.out.println("Number 2 :" + c1.getNum2());

        System.out.println("Additon :" + c1.add());
        System.out.println("Substraction :" + c1.Substract());
        System.out.println("Multiplication :" + c1.Multiply());

        try {

            System.out.println("Division :" + c1.Division());

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        }

    }

}

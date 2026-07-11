package MethodOverloading;

class Overload {

    void add(int a, int b) {

        System.out.println("Sum =" + (a + b));
    }

    void add(double a, double b) {

        System.out.println("Sum =" + (a + b));
    }

    void add(int a, int b, int c) {

        System.out.println("Sum =" + (a + b + c));
    }

    void add() {

        System.out.println("No Data Inputed !");
    }

}

public class Example_01 {

    public static void main(String[] args) {

        Overload ob1 = new Overload();

        ob1.add(5, 5);
        ob1.add(5.5, 6);
        ob1.add(5, 10, 15);
        ob1.add();
    }

}

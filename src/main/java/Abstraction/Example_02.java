package Abstraction;

abstract class Shape {
    
    

    double d1, d2;

    Shape(double d1, double d2) {

        this.d1 = d1;
        this.d2 = d2;

    }

    abstract void area();

    
    
}

class Rectangle extends Shape {

    Rectangle(double d1, double d2) {

        super(d1, d2);
    }

    @Override

    void area() {

        double result = d1 * d2;

        System.out.println("Rectangle Area :" + result);
    }

}

class Triangle extends Shape {

    Triangle(double d1, double d2) {

        super(d1, d2);
    }

    @Override

    void area() {

        double result = 0.5 * d1 * d2;

        System.out.println("Triangle Area :" + result);
    }

}

class Circle extends Shape {

    Circle(double r) {

        super(r, r);
    }

    @Override

    void area() {

        double result = 3.146 * d1 * d2;

        System.out.println("Circle Area :" + result);
    }

}

public class Example_02 {

    public static void main(String[] args) {

        Shape shape;

        shape = new Rectangle(10, 20);
        shape.area();
        shape = new Triangle(10, 20);
        shape.area();
        shape = new Circle(10);
        shape.area();

    }

}

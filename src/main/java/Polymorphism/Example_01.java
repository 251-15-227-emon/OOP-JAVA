package Polymorphism;

class Shape {

    double area() {
        return 0;

    }
}

class Rectangle extends Shape {

    double length, width;

    Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
    }

    @Override
    double area() {

        return length * width;
    }

}

class Triangle extends Shape {

    double base, height;

    Triangle(double base, double height) {

        this.base = base;
        this.height = height;

    }

    @Override
    double area() {

        return 0.5 * base * height;
    }

}



public class Example_01 {

    public static void main(String[] args) {

        Shape s = new Shape();
        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(10, 20);

        System.out.println("Shape Area =  "+s.area());
        System.out.println( "Rectangle Area = "+r.area());
        System.out.println("Triangle Area = "+t.area());

    }

}

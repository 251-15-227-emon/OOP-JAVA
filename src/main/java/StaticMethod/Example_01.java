package StaticMethod;

class StaticExample {

    void display1() {

        System.out.println("This is not a Static Mehod !");
    }

    static void display2() {

        System.out.println("This is a Static Mehod !");

    }

}

public class Example_01 {

    public static void main(String[] args) {

        // Non static (Instance)
        StaticExample ob1 = new StaticExample();
        ob1.display1();

        //static
        StaticExample.display2();

    }

}

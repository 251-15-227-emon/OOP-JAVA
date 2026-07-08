package Encapsulation;

class Person {

    String name;
    int roll;

    void display() {

        System.out.println("Name :" + name);
        System.out.println("Roll :" + roll);

    }

}

public class SimpleEncapsulation {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Aslam";
        p1.roll = 10011;

        p1.display();

    }

}

package Inheritance;

class Person {
    
    
    
    

    String name;
    int age;

    void display() {

        System.out.println("Name :" + name);
        System.out.println("Age :" + age);

    }

}

class Teacher extends Person {

    String qualification;

    void display2() {
        
        super.display();
        System.out.println("Qualification :" + qualification);

    }

}

public class Example_01 {

    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.name = "Dr.Ibrahim Zico";
        t1.age = 40;
        t1.qualification = "PhD";

        t1.display2();
    }

}

package MethodOverriding;

class Person {

    String name;
    int id;

    Person(String name, int id) {

        this.name = name;
        this.id = id;
    }

    void displayinfo() {

        System.out.println("Name :" + name);
        System.out.println("Id :" + id);

    }

}

class Teacher extends Person {

    String qualification;

    Teacher(String name, int id, String qualification) {

        super(name, id);
        this.qualification = qualification;

    }

    @Override
    void displayinfo() {
        super.displayinfo();
        System.out.println("Qualification:" + qualification);

    }

}

public class Example_01 {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mr. Akram", 1001 , "Bsc");
        t1.displayinfo();
        
        System.out.println("\n");

        Person p1 = new Person("Ahsan",77771);
        p1.displayinfo();

    }
}

package StaticVariable;

class Student01  {

    static int count = 0;

    Student01() {

        // every time called student class for creating object will increase count 
        count++;

    }

    void display() {

        System.out.println("Total Student :" + count);

    }

}

public class Example_02 {

    public static void main(String[] args) {

        Student01 s1 = new Student01();
        s1.display();
        Student01 s2 = new Student01();
        s2.display();
        Student01 s3 = new Student01();
        s3.display();

    }

}

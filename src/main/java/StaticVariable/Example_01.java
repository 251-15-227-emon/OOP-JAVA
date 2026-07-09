package StaticVariable;

class Student {

    String name;

    static String uniName = "Daffodil International University";

}

public class Example_01 {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Rahim Uddin";
        System.out.println("Student Name :" + s1.name);
        System.out.println("University Name :" + Student.uniName + "\n");

        s2.name = "Abu Ihlal";
        System.out.println("Student Name :" + s2.name);

        System.out.println("University Name :" + Student.uniName);
    }

}

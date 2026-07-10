package Constructor_Overloading;

class Teacher {

    String name, gender;
    int roll;

    Teacher(String n, String g) {

        name = n;
        gender = g;

    }

    Teacher(String n, String g, int r) {

        name = n;
        gender = g;
        roll = r;

    }

    Teacher() {

        System.out.println(" NO INFORMATION !");
    }

    void display() {

        System.out.println("Name :" + name);
        System.out.println("Gender :" + gender);
        System.out.println("Roll :" + roll);

    }

}

public class Example_01 {

    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("Shakira", "Female", 111000);
        Teacher t3 = new Teacher("Zalatan ","male");

        t1.display();
        System.out.println("\n");
        t2.display();
        System.out.println("\n");

        t3.display();
    }

}

package Input_Scannar;

import java.util.Scanner;

class Student {

    String name, university;
    int id;

    void display() {

        System.out.println("Name :" + name);
        System.out.println("ID :" + id);

        System.out.println("University Name :" + university);
    }

}

public class Example_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student s1 = new Student();

        System.out.println("Enter Name :");

        s1.name = input.nextLine();
        input.nextLine();

        System.out.println("Enter Student Id :");
        s1.id = input.nextInt();
        input.nextLine();

        System.out.println("Enter University Name :");
        s1.university = input.nextLine();

        s1.display();

    }

}

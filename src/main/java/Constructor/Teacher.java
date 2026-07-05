package Constructor;

public class Teacher {

    String name, university;
    int id;
    
    // Default Constructor

    Teacher() {

        System.out.println("No Value Inputed !!");

    }

    
    //Parameterized Constructor 
    Teacher(String name, int id,String university) {

        this.name = name;
        this.id = id;
        this.university = university;

    }

    
    // Method
    
    void display() {

        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("University : " + university);

    }

}

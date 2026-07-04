package Method;

public class Student {

    String name, university;
    int id;

//parameterized Method
    void setinfo(String name, String university, int id) {

        this.name = name;
        this.id = id;
        this.university = university;

    }
 // return nothing;

// Default Method 
    void display() {

        System.out.println("Name :" + name);
        System.out.println("ID :" + id);
        System.out.println("University :" + university);

    }

}

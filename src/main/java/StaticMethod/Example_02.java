package StaticMethod;

class Teacher {

    String Name;
    int Id;
    static String UniName = "DIU";

    Teacher(String Name, int ID) {
        this.Name = Name;
        this.Id = ID;

    }

    //static method
    void display() {

        System.out.println("Name :" + Name);
        System.out.println("ID :" + Id);
        
        //static 

        System.out.println("University Name :" + UniName);

    }
}

public class Example_02 {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ahsan", 1010);
        Teacher t2 = new Teacher("Habib", 1001);

        t1.display();
        t2.display();

    }

}

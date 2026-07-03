package Beginning;

class Teacher {

    String name, gender, phone;

    //parameterized Method
    void setinformation(String n, String g, String p) {
        name = n;
        gender = g;
        phone = p;

    }

    // Methods (return nothing)
    void display() {

        System.out.println("Name:" + name);
        System.out.println("Gender:" + gender);

        System.out.println("Phone:" + phone);

    }
}

public class Example_01 {
    public static void main(String[] args) {
        
    
    Teacher t1=new Teacher();
    
    t1.setinformation("Emon","Male","011111927");
    t1.display();
    
    }
}

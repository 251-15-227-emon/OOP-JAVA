package Inheritance;

class Person1 {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Teacher1 extends Person1 {

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    void display (){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
        
    }

}

public class Setter_Getter {
    
    
     
    public static void main(String[] args) {
        
        Teacher1 t1= new Teacher1();
        t1.setName("EMON");
        t1.setAge(24);
        t1.setQualification("Msc");
       
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getQualification());
        
        System.out.println("\n");
        
        Teacher1 t2= new Teacher1();
        t2.setName("Helal");
        t2.setAge(30);
        t2.setQualification("Bsc");
        
        t2.display();
        
        
        
        
    }
    
}

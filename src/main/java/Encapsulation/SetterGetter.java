
package Encapsulation;

class Details {

    private String name;
    private int roll;
   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

}

public class SetterGetter {
    
     
    public static void main(String[] args) {
        
        Details D1=new Details();
        D1.setName("Emon");       
        System.out.println("Name :"+D1.getName());
        D1.setRoll(227);       
        System.out.println("Roll :"+D1.getRoll());
        
    }
    
}

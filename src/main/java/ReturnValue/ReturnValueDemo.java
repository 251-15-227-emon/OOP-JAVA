package ReturnValue;

class Return {
    
    int value;

    int square(int value) {
        
        this.value=value;
        
        return value * value;
    }
}

public class ReturnValueDemo {

    public static void main(String[] args) {

        Return ob1 = new Return();

       int result =ob1.square(5);
       
        System.out.println("Square of " +ob1.value+" = "+result);

    }

}

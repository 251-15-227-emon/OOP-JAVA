package Interface;

interface Animal {

    public abstract void eat();

}

class Dog implements Animal {

    @Override
    public void eat() {

        System.out.println(" Dog can Eat Meats ");
    }

}

public class Example_01 {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.eat();
    }

}

package Interface;

// Interface support multiple inheritance 
interface A {

    void play();

}

interface B {

    void play();

}

class C implements A, B {

    @Override
    public void play() {

        System.out.println("I am From C ");

    }

}

public class Example_02 {

    public static void main(String[] args) {
        C c1 = new C();
        c1.play();
    }

}

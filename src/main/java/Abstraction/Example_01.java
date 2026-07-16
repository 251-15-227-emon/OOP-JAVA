package Abstraction;

abstract class MobileUser {

    abstract void SendMessage();

}

class Rahim extends MobileUser {

    @Override

    void SendMessage() {

        System.out.println("Hi,This is Rahim");
    }

}

class Karim extends MobileUser {

    @Override

    void SendMessage() {

        System.out.println("Hi,This is Karim");

    }
}

public class Example_01 {

    public static void main(String[] args) {
        MobileUser mu;

        mu = new Rahim();
        mu.SendMessage();
        mu = new Karim();
        mu.SendMessage();

    }

}

package JavaAbstraction;

// abstraction is where variables and methods can be used to create others
abstract class Dog {

    String breed;

    public void bark() {
        System.out.println("Bark!");
    }

    public abstract void poop();
}

class Chihuahua extends Dog {

    public void poop() {
        System.out.println("Dog pooped!");
    }
}

public class abstractionInJava {
    public static void main(String[] args) {
        Chihuahua ch = new Chihuahua();

        ch.bark();
        ch.poop();
    }
}

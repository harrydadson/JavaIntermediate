package JavaPolymorphism;

class Bird {

    public void sing() {
        System.out.println("tweet tweet");
    }

}

class Robin extends Bird {

    public void sing() {
        System.out.println("twiddle deedee");
    }

}

public class polymorphism {
    
    public static void main(String[] args) {
        Bird b = new Bird();
        b.sing();

        Robin r = new Robin();
        r.sing();
    }
}

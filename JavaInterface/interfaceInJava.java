package JavaInterface;

/**
 * InnerinterfaceInJava
 */
interface WaterBottle {
    String color = "Blue";
    void fillUp();
    void pourOut();
}

public class interfaceInJava implements WaterBottle {
    public static void main(String[] args) {

        System.out.println(color);

        interfaceInJava ex = new interfaceInJava();
        ex.fillUp();
        ex. pourOut();
    }

    @Override
    public void fillUp() {
        System.out.println("It's filled up");
    }

    @Override
    public void pourOut() {
        System.out.println("it's done");
    }
}

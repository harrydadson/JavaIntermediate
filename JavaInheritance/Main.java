package JavaInheritance;

public class Main {
    public static void main(String[] args) {

        Mouse1 m1 = new Mouse1();
        Mouse2 m2 = new Mouse2();
        Mouse3 m3 = new Mouse3();

        m1.leftClick();
        m2.connect();
        System.out.println(m3.ambidextrous);

    }
}

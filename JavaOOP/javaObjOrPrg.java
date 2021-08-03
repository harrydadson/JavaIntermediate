package JavaOOP;

public class javaObjOrPrg {
    public static void main(String[] args) {
        Pen p = new Pen();
        Headphones h = new Headphones();

        System.out.println(p.color);
        System.out.println(p.type);
        System.out.println(p.point);

        // Pen
        System.out.println(p.clicked);
        p.click();
        System.out.println(p.clicked);

        //Headphones
        System.out.println(h.charge);
        System.out.println(h.power);
        h.powerOn();
        h.volumeUp();
        System.out.println(h.power);
    
    }
}

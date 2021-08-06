package JavaSubSuperClass;

public class main {
    public static void main(String[] args) {
        
        Shoe s = new Shoe("Nike", 10);
        Walking w = new Walking(true, "Adidas", 11);
        Running r = new Running(5.5, "Puma", 12);

        System.out.println(s.brand);
        System.out.println(w.brand);
        System.out.println(r.weight);
    }
}

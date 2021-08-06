package JavaInnerClasses;

class Outside {
    int a = 0;

    class Inside {
        int b = 5;
    }
}

public class innerStellar {
    public static void main(String[] args) {
        
        Outside o = new Outside();
        Outside.Inside i = o.new Inside();
        System.out.println(o.a + " " + i.b);
    }
}

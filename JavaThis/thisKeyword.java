package JavaThis;

public class thisKeyword {

    int a;
    int b;

    public  void setData(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static void main(String[] args) {

        thisKeyword t = new thisKeyword();
        t.setData(4,3);
        
        System.out.println(t.a);
        System.out.println(t.b);
    }
}

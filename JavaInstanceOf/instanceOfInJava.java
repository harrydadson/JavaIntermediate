package JavaInstanceOf;

class Bird {
    public void sing() {
        System.out.println("Singing");
    }
}

class Eagle extends Bird {

    
}

public class instanceOfInJava {
    public static void main(String[] args) {
        
        Eagle e = new Eagle();
        System.out.println(e instanceof Bird);

    }

}

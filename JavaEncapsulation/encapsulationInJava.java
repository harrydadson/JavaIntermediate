package JavaEncapsulation;

// using methods to set vars in a class

public class encapsulationInJava {
    public static void main(String[] args) {
        
        Student s = new Student();
        s.setName("Tommy");
        s.setAge(24);

        System.out.println(s.getName());
        System.out.println(s.getAge());

    }
}

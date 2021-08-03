package JavaEnum;

enum Level {
    LOW, MEDIUM, HIGH;

}

public class enumJava {

    // or
    enum Flavor {
        CHOCOLATE, VANILLA, STRAWBERRY;
    }
    public static void main(String[] args) {

        Level l = Level.LOW;
        System.out.println(l);

        Flavor flav = Flavor.VANILLA;


        switch (l) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("MEDIUM level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
            default:
                break;


            // if (flav == Flavor.VANILLA) {
            //     System.out.println("its vanilla");
            // } else if(flav == flav.CHOCOLATE) {
            //     System.out.println("its chocolate");
            // } else if(flav == flav.STRAWBERRY) {
            //     System.out.println("its strawberry");
            // }
        }
    }
    
}

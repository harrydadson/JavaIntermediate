package JavaConstructors;

public class Shirt {
    public static String color;
    public static char size;

    Shirt(String newColor, char newSize) {
        color = newColor;
        size = newSize;
    };

    public static void putOn() {
        System.out.println("Shirt On");
    }
    public static void putOff() {
        System.out.println("Shirt Off");
    }

    public static void setColor(String newColor) {
        color = newColor;
    }
    public static void setSize(char newSize) {
        size = newSize;
    }
}

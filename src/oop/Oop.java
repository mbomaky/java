package oop;

public class Oop {
    String name;
    String color;
    int weight;
    private static final String text = "fdjkdsjkdf";

    public static void getText() {
        System.out.println(text);
    }

    @Override
    public String toString() {
        return "Oop{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Oop(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return this.name + text;
    }

    public void ff() {
        String name = getName();
        System.out.println(name);
    }
}

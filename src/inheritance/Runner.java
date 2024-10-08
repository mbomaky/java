package inheritance;

public class Runner {
    public static void main(String[] args) {
        Child child = new Child();
        String childType = child.getType();

        System.out.println(childType);
    }
}

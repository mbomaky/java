package inheritance;

abstract class Parent {
    private String type = "human";

    public Parent(String type) {
        this.type = type;
    }

    public Parent() {}

    String getType() {
        return type;
    }
}

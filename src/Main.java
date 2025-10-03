import java.util.stream.Stream;

public class Main {
    private Boolean isDone;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        Stream<Integer> stream = Stream.of(1, 2);
    }

    public Boolean getDone(String strongParam, String st) {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

}
package loop;

public class Loop {
    public Loop() {
        short[] arr = {1,23,3,4,5,6,7};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

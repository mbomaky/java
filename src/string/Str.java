package string;
import java.util.Scanner;

public record Str(String str) {
    public Str(String str) {
        this.str = str;
        String res = this.getStr();
        System.out.println(res);
        double a = 2.5 + (5 /10);
        System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        byte number = sc.nextByte();
        System.out.println("yr number is: " + number);
    }

    public String getStr() {
        return str + " me and my string;";
    }
}

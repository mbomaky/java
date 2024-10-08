//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import loop.Loop;
import testpack.Test;
import array.Array;
import string.Str;
import panel.Panel;
import oop.Oop;

public class Main {
    public static void main(String[] args) {
//        new Test();
//        Array array = new Array("test initialized array");
//        new Loop();
//        new Str("string from main class");
//        new Panel();
        Oop oop = new Oop("Vasya", "red", 150);
        System.out.println(oop.toString());
        oop.ff();
        Oop.getText();
    }
}
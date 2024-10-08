package panel;
import javax.swing.JOptionPane;

public class Panel {
    public Panel() {
        String whatever = JOptionPane.showInputDialog("What is your name or what?");

        JOptionPane.showMessageDialog(null, "whatever: " + whatever);

        System.out.println("You said: " + whatever);
    }
}

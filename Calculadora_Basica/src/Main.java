import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CALCULADORA");
        frame.setContentPane(new form1().mainpannel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024,768);
        frame.setPreferredSize(new Dimension(1024,768));
        frame.pack();
        frame.setVisible(true);
    }
}
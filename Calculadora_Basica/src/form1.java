import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JButton DiviButton;
    private JButton MultiButton;
    private JButton sumaButton;
    private JButton restaButton;
    public JPanel mainpannel;
    private JTextField num1;
    private JTextField num2;
    private JLabel RTotal;

    public form1() {
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(num1.getText());
                Double numero2 = Double.parseDouble(num2.getText());
                RTotal.setText(String.valueOf(numero1+numero2));
                System.out.println(numero1+numero2);
            }
        });
        restaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(num1.getText());
                Double numero2 = Double.parseDouble(num2.getText());
                RTotal.setText(String.valueOf(numero1-numero2));
                System.out.println(numero1-numero2);
            }
        });
        MultiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(num1.getText());
                Double numero2 = Double.parseDouble(num2.getText());
                RTotal.setText(String.valueOf(numero1*numero2));
                System.out.println(numero1*numero2);
            }
        });
        DiviButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.parseDouble(num1.getText());
                Double numero2 = Double.parseDouble(num2.getText());
                RTotal.setText(String.valueOf(numero1/numero2));
                System.out.println(numero1/numero2);
            }
        });
    }
}

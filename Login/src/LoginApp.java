import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApp {

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Login");
        //Tamaño-ventana
        frame.setSize(400, 300);
        //Cerrar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Diseño-Ventana
        frame.setLayout(new GridLayout(3, 2));

        // Crear los componentes de la interfaz
        JLabel labelUser = new JLabel("Usuario:");
        JTextField textUser = new JTextField();
        JLabel labelPassword = new JLabel("Contraseña:");
        JPasswordField textPassword = new JPasswordField();
        JButton loginButton = new JButton("Iniciar sesión");

        // Añadir los componentes a la ventana
        frame.add(labelUser);
        frame.add(textUser);
        frame.add(labelPassword);
        frame.add(textPassword);
        frame.add(loginButton);

        // Acción al presionar el botón de login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Obtener Texto
                String username = textUser.getText();
                //Obtener Contraseña
                char[] password = textPassword.getPassword();

                // Validar las credenciales
                if (validateLogin(username, password)) {
                    JOptionPane.showMessageDialog(frame, "Bienvenido!");
                    } else {
                    JOptionPane.showMessageDialog(frame, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        // Visible-Ventana
        frame.setVisible(true);
    }
    // Validar Credenciales
    public static boolean validateLogin(String username, char[] password) {
        String correctUsername = "mendara"; // Nombre de usuario correcto
        String correctPassword = "Leito_2015";   // Contraseña correcta

        // Comparar Credenciales
        return username.equals(correctUsername) && new String(password).equals(correctPassword);
    }
}

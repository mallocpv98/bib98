package view;

import javax.swing.*;
import java.awt.*;

public class HomeView extends JFrame {

    private JButton loginButton;

    public HomeView() {
        // Impostazioni del frame
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Centra la finestra al centro dello schermo

        // Pannello principale
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        add(mainPanel);

        // Pannello centrale per il pulsante di login
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Creazione del pulsante di login
        loginButton = new JButton("Login");
        centerPanel.add(loginButton);
    }

    // Metodo per ottenere il pulsante di login
    public JButton getLoginButton() {
        return loginButton;
    }

 
}

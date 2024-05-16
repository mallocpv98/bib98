package view;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FramePanel extends JFrame {

    private JPanel panel;

    public FramePanel(String titolo, JPanel panel) {
        super(titolo);
        this.panel = panel;

        // Configura il frame
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Aggiungi il pannello al frame
        getContentPane().add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    public void showFrame() {
        // Rendi il frame visibile
        setVisible(true);
    }


    public void cambiaPannello(JPanel jPanel) {
        getContentPane().removeAll();  // Rimuove tutti i componenti dal content pane
        getContentPane().add(jPanel, BorderLayout.CENTER);  // Aggiunge il nuovo pannello al content pane
        revalidate();  // Rende effettive le modifiche al content pane
        repaint();  // Ridisegna il frame
    }
}


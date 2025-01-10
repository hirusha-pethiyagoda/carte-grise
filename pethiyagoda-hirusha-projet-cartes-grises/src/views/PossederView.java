package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PossederView extends JFrame {

    public PossederView() {
        // Définir le titre de la fenêtre
        setTitle("Hello World View");
        // Définir la taille de la fenêtre
        setSize(300, 200);
        // Fermer l'application lorsque l'utilisateur ferme la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Centrer la fenêtre sur l'écran
        setLocationRelativeTo(null);
        // Utiliser un layout pour organiser les composants
        setLayout(new BorderLayout());

        // Créer un label avec le message "Hello, World!"
        JLabel helloLabel = new JLabel("Hello, World!", SwingConstants.CENTER);
        add(helloLabel, BorderLayout.CENTER);

        // Créer un bouton "Retour"
        JButton retourButton = new JButton("Retour");
        retourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fermer la fenêtre actuelle
                dispose();
            }
        });
        // Ajouter le bouton en bas de la fenêtre
        add(retourButton, BorderLayout.SOUTH);

        // Rendre la fenêtre visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Créer une instance de la vue PossederView
        new PossederView();
    }
}

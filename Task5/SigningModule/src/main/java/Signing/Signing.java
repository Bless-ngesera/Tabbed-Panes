package Signing;

import javax.swing.*;

public class Signing {
    public JPanel createSigningTab() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Player Name:");
        JTextField nameField = new JTextField();
        JButton submitButton = new JButton("Sign Player");

        nameLabel.setBounds(20, 50, 120, 30);
        nameField.setBounds(120, 50, 200, 30);
        submitButton.setBounds(50, 100, 150, 30);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(submitButton);

        submitButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Player Signed: " + nameField.getText()));

        return panel;
    }

    public static JPanel getSigningPanel() {
        return new Signing().createSigningTab();
    }
}


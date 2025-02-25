package Signing;
import Management.*;
import javax.swing.*;
import java.util.List;

public class Signing {
    private List<Player> signedPlayers;
    private DefaultListModel<String> managementListModel;

    public Signing(List<Player> signedPlayers, DefaultListModel<String> managementListModel) {
        this.signedPlayers = signedPlayers;
        this.managementListModel = managementListModel;
    }

    public JPanel createSigningTab() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Player Name");
        JTextField nameField = new JTextField();
        JLabel ageLabel = new JLabel("Age");
        JTextField ageField = new JTextField();
        JLabel positionLabel = new JLabel("Position");
        JTextField positionField = new JTextField();
        JLabel nationalityLabel = new JLabel("Nationality");
        JTextField nationalityField = new JTextField();
        JButton submitButton = new JButton("Sign Player");

        nameLabel.setBounds(50, 20, 120, 30);
        nameField.setBounds(20, 50, 150, 30);
        ageLabel.setBounds(260, 20, 120, 30);
        ageField.setBounds(200, 50, 150, 30);
        positionLabel.setBounds(60, 90, 120, 30);
        positionField.setBounds(20, 120, 150, 30);
        nationalityLabel.setBounds(240, 90, 120, 30);
        nationalityField.setBounds(200, 120, 150, 30);
        submitButton.setBounds(110, 170, 150, 30);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(positionLabel);
        panel.add(positionField);
        panel.add(nationalityLabel);
        panel.add(nationalityField);
        panel.add(submitButton);

        submitButton.addActionListener(e -> {
            String playerName = nameField.getText();
            String ageText = ageField.getText();
            String position = positionField.getText();
            String nationality = nationalityField.getText();

            if (!playerName.isEmpty() && !ageText.isEmpty() && !position.isEmpty() && !nationality.isEmpty()) {
                int age = Integer.parseInt(ageText);
                Player player = new Player(playerName, age, position, nationality);
                signedPlayers.add(player);
                managementListModel.addElement(player.toString()); // Add player to the Management list model
                JOptionPane.showMessageDialog(null, "Player Signed: " + player);
                nameField.setText(""); // Clear the input field
                ageField.setText("");
                positionField.setText("");
                nationalityField.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            }
        });

        return panel;
    }

    public static JPanel getSigningPanel(List<Player> signedPlayers, DefaultListModel<String> managementListModel) {
        return new Signing(signedPlayers, managementListModel).createSigningTab();
    }
}

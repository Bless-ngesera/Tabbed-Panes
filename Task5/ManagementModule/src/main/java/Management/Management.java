package Management;
import javax.swing.*;
import java.awt.*;

public class Management {
    public JPanel createListTab() {
        JPanel panel = new JPanel(new BorderLayout());
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> list = new JList<>(listModel);

        JButton addButton = new JButton("Add Player");
        addButton.addActionListener(e -> listModel.addElement("Player " + (listModel.size() + 1)));

        JButton clearButton = new JButton("Clear List");
        clearButton.addActionListener(e -> listModel.clear());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);

        panel.add(new JScrollPane(list), BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    public JPanel createInfoTab() {
        JPanel panel = new JPanel();
        JTextArea infoArea = new JTextArea("Welcome to the Football Signing & Performance App!\nThis tab provides useful information.");
        infoArea.setEditable(false);
        panel.add(infoArea);
        return panel;
    }

    public static JPanel getListPanel() {
        return new Management().createListTab();
    }

    public static JPanel getInfoPanel() {
        return new Management().createInfoTab();
    }
}

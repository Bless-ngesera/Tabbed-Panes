package Management;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Management {
    private List<Player> signedPlayers;
    private DefaultListModel<String> listModel;

    public Management(List<Player> signedPlayers, DefaultListModel<String> listModel) {
        this.signedPlayers = signedPlayers;
        this.listModel = listModel;
    }

    public JPanel createListTab() {
        JPanel panel = new JPanel(new BorderLayout());
        JList<String> list = new JList<>(listModel);

        JButton addButton = new JButton("Add Player");
        addButton.addActionListener(e -> addPlayersToList());

        JButton clearButton = new JButton("Clear List");
        clearButton.addActionListener(e -> listModel.clear());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);

        panel.add(new JScrollPane(list), BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    private void addPlayersToList() {
        listModel.clear();
        for (Player player : signedPlayers) {
            listModel.addElement(player.toString());
        }
    }

    public JPanel createInfoTab() {
        JPanel panel = new JPanel();
        JTextArea infoArea = new JTextArea("Welcome to the Football Signing & Performance App!\nThis tab provides useful information.");
        infoArea.setEditable(false);
        panel.add(infoArea);
        return panel;
    }

    public static JPanel getListPanel(List<Player> signedPlayers, DefaultListModel<String> listModel) {
        return new Management(signedPlayers, listModel).createListTab();
    }

    public static JPanel getInfoPanel() {
        return new Management(new java.util.ArrayList<>(), new DefaultListModel<>()).createInfoTab();
    }
}
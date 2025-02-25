package Performance;

import Management.Player;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class Performance {
    private List<Player> signedPlayers;

    public Performance(List<Player> signedPlayers) {
        this.signedPlayers = signedPlayers;
    }
    public JPanel createPerformanceTab() {
        JPanel panel = new JPanel(new BorderLayout());
        String[] columns = {"Player", "Goals", "Assists"};
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);

        JButton addButton = new JButton("Add Performance");
        addButton.addActionListener(e -> {
            int rowCount = tableModel.getRowCount();
            if (rowCount < signedPlayers.size()) {
                String playerName = signedPlayers.get(rowCount).getName();
                tableModel.addRow(new Object[]{playerName, 0, 0});
            } else {
                JOptionPane.showMessageDialog(null, "No more players to add performance for.");
            }
        });

        JButton clearButton = new JButton("Clear Data");
        clearButton.addActionListener(e -> tableModel.setRowCount(0));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);

        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    public static JPanel getPerformancePanel(List<Player> signedPlayers) {
        return new Performance(signedPlayers).createPerformanceTab();
    }
}


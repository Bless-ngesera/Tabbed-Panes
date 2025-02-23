package Performance;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Performance {
    public JPanel createPerformanceTab() {
        JPanel panel = new JPanel(new BorderLayout());
        String[] columns = {"Player", "Goals", "Assists"};
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);

        JButton addButton = new JButton("Add Performance");
        addButton.addActionListener(e -> tableModel.addRow(new Object[]{"Player " + (tableModel.getRowCount() + 1), 0, 0}));

        JButton clearButton = new JButton("Clear Data");
        clearButton.addActionListener(e -> tableModel.setRowCount(0));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);

        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    public static JPanel getPerformancePanel() {
        return new Performance().createPerformanceTab();
    }
}

package MainApp;
import Signing.Signing;
import Performance.Performance;
import Management.Management;
import Actions.Actions;
import javax.swing.*;
import java.awt.*;

public class FootballApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FootballApp().createAndShowGUI());
    }
    private void createAndShowGUI() {
        JFrame frame = new JFrame("Football Signing & Performance");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);

        JPanel mainPanel = new JPanel(new GridLayout(1, 5, 10, 10));

        mainPanel.add(Signing.getSigningPanel());
        mainPanel.add(Performance.getPerformancePanel());
        mainPanel.add(Management.getListPanel());
        mainPanel.add(Actions.getActionsPanel());
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}



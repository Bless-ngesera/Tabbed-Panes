package MainApp;
import Actions.Actions;
import Signing.Signing;
import Performance.Performance;
import Management.Management;
import Management.Player;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FootballApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FootballApp().createAndShowGUI());
    }
    private void createAndShowGUI() {
        JFrame frame = new JFrame("Football Signing & Performance");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 600);

        JPanel mainPanel = new JPanel(new GridLayout(1, 4, 10, 10));

        List<Player> signedPlayers = new ArrayList<>();
        DefaultListModel<String> managementListModel = new DefaultListModel<>();

        JTabbedPane signingPane = new JTabbedPane();
        signingPane.addTab("Sign Player", Signing.getSigningPanel(signedPlayers, managementListModel));
        JTabbedPane performancePane = new JTabbedPane();
        performancePane.addTab("Performance", Performance.getPerformancePanel(signedPlayers));
        JTabbedPane managementPane = new JTabbedPane();
        managementPane.addTab("Management", Management.getListPanel(signedPlayers, managementListModel));
        JTabbedPane actionPane = new JTabbedPane();
        actionPane.addTab("Action", Actions.getActionsPanel());

        mainPanel.add(signingPane);
        mainPanel.add(performancePane);
        mainPanel.add(managementPane);
        mainPanel.add(actionPane);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}



package Actions;

import javax.swing.*;
public class Actions {
    public JPanel createActionsTab() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton ronaldoButton = playerRonaldo();
        JButton messiButton = playerMessi();
        JButton neymarButton = playerNeymar();
        JButton welcomeButton = showWelcome();

        ronaldoButton.setBounds(10, 30, 200, 40);
        messiButton.setBounds(10, 80, 200, 40);
        neymarButton.setBounds(10, 130, 200, 40);
        welcomeButton.setBounds(10, 180, 200, 40);

        panel.add(ronaldoButton);
        panel.add(messiButton);
        panel.add(neymarButton);
        panel.add(welcomeButton);

        return panel;
    }

    private JButton playerRonaldo() {
        JButton button = new JButton("Cristiano Ronaldo");
        button.addActionListener(e -> showAnalysis("Cristiano Ronaldo",
                "Nationality: Portugal\n" +
                        "Position: Forward\n" +
                        "Clubs: Sporting CP, Manchester United, Real Madrid, Juventus, Al Nassr\n" +
                        "Goals: 850+ career goals\n" +
                        "Achievements: 5x Ballon d'Or, 5x UEFA Champions League, Euro 2016 Winner\n" +
                        "Playing Style: A powerful, fast, and skillful attacker with an incredible finishing ability and aerial dominance."
        ));
        return button;
    }

    private JButton playerMessi() {
        JButton button = new JButton("Lionel Messi");
        button.addActionListener(e -> showAnalysis("Lionel Messi",
                "Nationality: Argentina\n" +
                        "Position: Forward\n" +
                        "Clubs: Barcelona, PSG, Inter Miami\n" +
                        "Goals: 800+ career goals\n" +
                        "Achievements: 8x Ballon d'Or, 4x UEFA Champions League, World Cup 2022 Winner\n" +
                        "Playing Style: A highly creative and intelligent playmaker with exceptional dribbling, vision, and goal-scoring ability."
        ));
        return button;
    }

    private JButton playerNeymar() {
        JButton button = new JButton("Neymar Jr.");
        button.addActionListener(e -> showAnalysis("Neymar Jr.",
                "Nationality: Brazil\n" +
                        "Position: Forward\n" +
                        "Clubs: Santos, Barcelona, PSG, Al Hilal\n" +
                        "Goals: 450+ career goals\n" +
                        "Achievements: UEFA Champions League Winner, Copa Libertadores Winner, Copa America Winner\n" +
                        "Playing Style: A flamboyant dribbler with excellent technical skills, creativity, and a strong finishing ability."
        ));
        return button;
    }

    private JButton showWelcome() {
        JButton button = new JButton("Welcome Message");
        button.addActionListener(e -> showAnalysis("Welcome",
                "Welcome to the Football Management System!\n" +
                        "Here, you can explore detailed analysis of some of the greatest football players.\n" +
                        "Click on a player's name to learn more!"
        ));
        return button;
    }

    private void showAnalysis(String title, String details) {
        JOptionPane.showMessageDialog(null, details, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static JPanel getActionsPanel() {
        return new Actions().createActionsTab();
    }
}

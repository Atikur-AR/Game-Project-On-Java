package Game_Project;

import javax.swing.SwingUtilities;

public class Game {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GameWindow();
        });
    }
}
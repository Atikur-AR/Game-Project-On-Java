package Game_Project;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;

public class GamePanel extends JPanel {

    private Image background;

    public GamePanel() {
        ImageIcon icon = new ImageIcon("E:\\Atikur\\Java\\Game_Project\\Images\\Background.png");
        background = icon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
         g.drawImage(
                background,
                0,
                0,
                getWidth(),
                getHeight(),
                this);
    }
}
package Package;
import java.awt.Toolkit;

import javax.swing.*;

public class StartaGame extends JFrame
{
    StartaGame()
    {
        add(new Board());
        setTitle("PacGame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(610, 650);
        setLocationRelativeTo(null);
        setVisible(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(StartaGame.class.getResource("/slike/1122.jpg")));
    }
}

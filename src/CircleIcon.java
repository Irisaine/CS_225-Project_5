import javax.swing.*;
import java.awt.*;

public class CircleIcon implements Icon {
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillOval(x,y,100,100);
    }

    @Override
    public int getIconWidth() {
        return 50;
    }

    @Override
    public int getIconHeight() {
        return 50;
    }
}

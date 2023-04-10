import javax.swing.*;
import java.awt.*;

public class TreeIcon implements Icon {
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawRect(x,y,10,50);

    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}

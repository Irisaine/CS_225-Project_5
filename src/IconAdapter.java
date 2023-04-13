import javax.swing.*;
import java.awt.*;

public class IconAdapter extends JComponent {
    private Icon adaptedIcon;

    public IconAdapter() {
        adaptedIcon = null;
    }

    public IconAdapter(Icon i) {
        adaptedIcon = i;
    }

    @Override
    public void paintComponent(Graphics g) {
        adaptedIcon.paintIcon(this,g,0,0);

    }
}

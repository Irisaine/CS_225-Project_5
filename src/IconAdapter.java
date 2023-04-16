import javax.swing.*;
import java.awt.*;

// IconAdapter is an Adapter design patterned object that allows Icons to be added to any GUI element that accepts
// a JComponent.

public class IconAdapter extends JComponent {
    private Icon adaptedIcon;

    public Icon getAdaptedIcon() {
        return adaptedIcon;
    }

    public void setAdaptedIcon(Icon adaptedIcon) {
        this.adaptedIcon = adaptedIcon;
    }

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

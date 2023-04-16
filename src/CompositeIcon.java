import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

// CompositeIcon is a composite design pattern for holding multiple icons and printing them as a unit.  The iconList
// holds each of the Icon object intended to be printed, while the posList holds an array of Point objects decscribing
// their location.

public class CompositeIcon implements Icon {
    private ArrayList<Icon> iconList;

    private ArrayList<Point> posList;

    public CompositeIcon() {
        iconList = new ArrayList<Icon>();
        posList = new ArrayList<Point>();
    }
    public ArrayList<Icon> getIconList() {
        return iconList;
    }

    public ArrayList<Point> getPosList() {
        return posList;
    }

    public void addIcon(Icon icon, int x, int y) {
        iconList.add(icon);
        posList.add(new Point(x,y));
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        for (int i = 0; i < iconList.size(); i++) {
            iconList.get(i).paintIcon(c, g, posList.get(i).x+ x, posList.get(i).y + y);
        }
    }

    @Override
    public int getIconWidth() {
        int maxWidth = 0;
        for (int i = 0; i < iconList.size(); i++) {
            if ((iconList.get(i).getIconWidth() + posList.get(i).x) > maxWidth)
                maxWidth = (iconList.get(i).getIconWidth() + posList.get(i).x);
        }
        return maxWidth;
    }

    @Override
    public int getIconHeight() {
        int maxHeight = 0;
        for (int i = 0; i < iconList.size(); i++) {
            if ((iconList.get(i).getIconHeight() + posList.get(i).y) > maxHeight)
                maxHeight = (iconList.get(i).getIconHeight() + posList.get(i).y);
        }
        return maxHeight;
    }
}

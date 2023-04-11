import javax.swing.*;

public class CompositeIconTester {

    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setSize(400,400);
        testFrame.setVisible(true);
        testFrame.setTitle("Composite Icon Tester");

        CompositeIcon compTest = new CompositeIcon();
        SquareIcon squareTest = new SquareIcon();
        CircleIcon circleTest = new CircleIcon();

        compTest.addIcon(squareTest, 40, 60);
        compTest.addIcon(circleTest, 100, 150);
        compTest.paintIcon(testFrame, testFrame.getGraphics(), 0,0);
    }
}

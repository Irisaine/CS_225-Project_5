import javax.swing.*;

public class CompositeIconTester {

    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        JLabel testLabel;

        CompositeIcon compTest = new CompositeIcon();
        SquareIcon squareTest = new SquareIcon();
        CircleIcon circleTest = new CircleIcon();

        compTest.addIcon(squareTest, 0, 0);
        compTest.addIcon(circleTest, 100, 100);

        testLabel = new JLabel(compTest);

        testFrame.add(testLabel);

        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setSize(400,400);
        testFrame.setVisible(true);
        testFrame.setTitle("Composite Icon Tester");

    }
}

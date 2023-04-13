import javax.swing.*;

public class IconAdapterTester {

    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        CircleIcon circleTest = new CircleIcon();
        IconAdapter adapterTest = new IconAdapter(circleTest);


        testFrame.add(adapterTest);

        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setSize(400,400);
        testFrame.setVisible(true);
        testFrame.setTitle("Icon Adapter Tester");

    }
}

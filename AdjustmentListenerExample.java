

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdjustmentListenerExample implements AdjustmentListener {
    Frame jf;
    Panel jp, jp2;
    Label frameLabel1;

    AdjustmentListenerExample() {
        jf = new JFrame("Scrollbar");

        // Creating the first JPanel and adding two JLabels to it
        jp = new Panel();

        // Creating a Label
        Label panelLabel1 = new Label("Handling a Scrollbar drag event", Label.CENTER);

        jp = new Panel(new BorderLayout());

        // Adding the Label to NORTH of the Panel
        jp.add(panelLabel1, BorderLayout.NORTH);

        // Creating the horizontal Scrollbar
        Scrollbar scrollBHorizontal = new Scrollbar(Scrollbar.HORIZONTAL, 10, 40, 0, 100);

        // Creating the vertical Scrollbar
        Scrollbar scrollBVertical = new Scrollbar(Scrollbar.VERTICAL, 10, 60, 0, 100);

        // Adding the horizontal Scrollbar to SOUTH of Panel
        jp.add(scrollBHorizontal, BorderLayout.SOUTH);

        // Adding the vetical Scrollbar to EAST of JPanel
        jp.add(scrollBVertical, BorderLayout.EAST);

        // Getting the current position value of horizontal scrollbar
        Integer i = scrollBHorizontal.getValue();

        // Creating a JLabel and setting its value to the current position value of
        // horizontal scrollbar.
        frameLabel1 = new Label(i.toString());

        // Adding this JLabel to SOUTH of the JFrame
        jf.add(frameLabel1, BorderLayout.SOUTH);

        // Adding the first JPanel to the CENTER of JFrame
        jf.add(jp, BorderLayout.CENTER);

        // Registering class ScrollEx2 to catch and respond to scrollbar adjustment
        // events
        scrollBHorizontal.addAdjustmentListener(this);
        scrollBVertical.addAdjustmentListener(this);

        jf.setSize(350, 270);
        jf.setVisible(true);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        Integer i = e.getValue();
        frameLabel1.setText(i.toString());
    }

    public static void main(String[] ar) {
        new AdjustmentListenerExample();
    }

}

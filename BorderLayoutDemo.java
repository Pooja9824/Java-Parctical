import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import java.awt.event.*;
//import java.swing.*;

class bdlayout extends JFrame {
    bdlayout() {
        JPanel pa = new JPanel();
        pa.setLayout(new BorderLayout());
        pa.add(new JButton("ksc"), BorderLayout.SOUTH);
        pa.add(new JButton("Layout"), BorderLayout.EAST);
        pa.add(new JButton("Border"), BorderLayout.WEST);
        pa.add(new JButton("KSCPAC"), BorderLayout.CENTER);

        add(pa);
        setSize(300, 300);
        setVisible(true);
    }

}

public class BorderLayoutDemo {
    public static void main(String[] args) {
        new bdlayout();
    }
}

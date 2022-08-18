//package SwingCompDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCompDemo {
    SwingCompDemo() {
        JFrame f = new JFrame("swing comp example");
        JButton b = new JButton("click here");
        b.setBounds(10, 10, 100, 40);
        f.add(b);

        JLabel textLbl = new JLabel("this is label");
        textLbl.setBounds(10, 50, 100, 40);
        f.add(textLbl);

        JTextField txtbox = new JTextField(20);
        txtbox.setBounds(10, 50, 100, 40);
        f.add(textLbl);

        JTextArea txtarea = new JTextArea("this is textArea", 5, 20);
        txtarea.setBounds(10, 130, 100, 60);
        f.add(txtarea);

        JPasswordField pwdField = new JPasswordField(15);
        pwdField.setBounds(10, 200, 100, 40);
        f.add(pwdField);

        JCheckBox chkBox = new JCheckBox("Show help", true);
        chkBox.setBounds(10, 240, 100, 40);
        f.add(chkBox);

        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButton rbl = new JRadioButton("Easy", true);
        JRadioButton rb2 = new JRadioButton("Medium");
        JRadioButton rb3 = new JRadioButton("Hard");

        radioGroup.add(rbl);
        radioGroup.add(rb2);
        radioGroup.add(rb3);

        rbl.setBounds(10, 270, 100, 40);
        rb2.setBounds(10, 300, 100, 40);
        rb3.setBounds(10, 330, 100, 40);

        f.add(rbl);
        f.add(rb2);
        f.add(rb3);

        String[] itemsD = { "Amreli", "Surat", "Baroda", "Rajkot" };
        JList<String> list = new JList<>(itemsD);
        list.setBounds(150, 100, 75, 75);
        f.add(list);

        String[] cityString = { "Mumbai", "London", "Newyork", "Sydney", "Tokyo" };
        JComboBox cities = new JComboBox<>(cityString);
        cities.setSelectedIndex(3);
        cities.setBounds(150, 200, 100, 50);
        f.add(cities);

        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingCompDemo();
    }
}

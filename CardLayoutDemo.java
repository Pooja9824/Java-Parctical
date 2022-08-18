import java.awt.*;
import java.awt.event.*;

class CardDemos extends Frame implements ActionListener {

    CardLayout card = new CardLayout(20, 20);

    CardDemos() {

        setLayout(card);
        Button Btnf = new Button("First");
        Button Btns = new Button("Second");
        Button Btnt = new Button("Third");
        add(Btnf, "Card1");
        add(Btns, "Card2");
        add(Btnt, "Card3");

        Btnf.addActionListener(this);
        Btns.addActionListener(this);
        Btnt.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        card.next(this);
    }
}

class CardLayoutDemo {
    public static void main(String[] args) {
        CardDemos frame = new CardDemos();

        frame.setTitle("CardLayout in java");
        frame.setSize(220, 150);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

import java.applet.Applet;
import java.awt.Graphics;

public class GraphicsWithApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("welcome to applett", 150, 150);
    }

}
/*
 * <applet code="GraphicsWithApplet.class" width="300" height="300">
 * </applet>
 */

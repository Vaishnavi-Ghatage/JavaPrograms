//Develop an applet that displays a simple message in center of the screen.

import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="SimpleApplet.class" width=300 height="300">
</applet>
*/
public class SimpleApplet extends Applet{
public void paint(Graphics g){
g.drawString("Welcome to Applet", 150, 150);
}
}
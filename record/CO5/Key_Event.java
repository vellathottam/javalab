import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Key_Event extends Applet implements KeyListener
{
        int x=10;
        int y=20;
        String msg="";
        public void init()
        {
            addKeyListener(this);
            requestFocus();
        }
         public void keyPressed(KeyEvent e)
        {
           showStatus("Key Down");
        }
        public void keyReleased(KeyEvent e)
        {
          showStatus("Key Up");
        }
        public void keyTyped(KeyEvent e)
        {
            msg+=e.getKeyChar();
            repaint();
        }
        public void paint(Graphics g)
        {
            g.drawString(msg,x,y);
        }
}
/*<applet code="Key_Event.class" width=300 height=300>
</applet>
*/        
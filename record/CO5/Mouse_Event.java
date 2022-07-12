import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Mouse_Event extends Applet implements MouseListener,MouseMotionListener
{
        int x=10;
        int y=10;
        String msg="";
        public void init()
        {
            addMouseListener(this);
            addMouseMotionListener(this);
        }
        public void mouseClicked(MouseEvent e)
        {
            msg="Mouse Clicked";
            repaint();
        }
         public void mouseEntered(MouseEvent e)
        {
            msg="Mouse Entered";
            repaint();
        }
         public void mouseExited(MouseEvent e)
        {
            msg="Mouse Exited";
            repaint();
        }
         public void mousePressed(MouseEvent e)
        {
            x=e.getX();
            y=e.getY();
            msg="Down";
            repaint();
        }
        public void mouseReleased(MouseEvent e)
        {
            x=e.getX();
            y=e.getY();
            msg="Up";
            repaint();
        }
        public void mouseDragged(MouseEvent e)
        {
            x=e.getX();
            y=e.getY();
            msg="*";
            showStatus("Dragging mouse at "+x+" & "+y);
            repaint();
        }
         public void mouseMoved(MouseEvent e)
        {
            showStatus("Moving mouse at "+e.getX()+" & "+e.getY());
        }
        public void paint(Graphics g)
        {
            g.drawString(msg,x,y);
        }
        /*<applet code="Mouse_Event.class" width=300 height=300>
        </applet>*/

}
        
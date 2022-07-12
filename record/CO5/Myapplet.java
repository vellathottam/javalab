import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Myapplet extends Applet implements ActionListener
{
        int f,s,t,big;
        TextField fno=new TextField(15);
        TextField sno=new TextField(15);
        TextField tno=new TextField(15);
        Button b=new Button("Find");
        public void init()
        {
            add(new Label("Enter First Number:"));
            add(fno);
            add(new Label("Enter Second Number:"));
            add(sno);
            add(new Label("Enter Third Number:"));
            add(tno);
            add(b);
            b.addActionListener(this);
        }
        public void paint(Graphics g)
        {
            g.drawString("Biggest number:" +big,110,170);
        }
        public void actionPerformed(ActionEvent e)
        {
            int f= Integer.parseInt(fno.getText());
            int s= Integer.parseInt(sno.getText());
            int t= Integer.parseInt(tno.getText());
            if(f > s)
            {
                if(f > t)
                            big=f;
                else
                            big=t;
            }
            else
            {
                if(s > t)
                            big=s;
                else
                            big=t;
            }
            repaint();
        }
            /*<applet code="Myapplet.class" width=300 height=300>
            </applet>*/

}

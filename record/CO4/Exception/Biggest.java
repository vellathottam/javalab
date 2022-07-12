import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Myapplet extends Applet implements ActionListener
{
    public Myapplet()
    {
        setLayout(new GridLayout(3,2,10,15));
        TextField fno=new TextField(15);
        TextField sno=new TextField(15);
        TextField tno=new TextField(15);
        add(new Label("Enter First Number:"));
        add(fno);
        add(new Label("Enter Second Number:"));
        add(sno);
        add(new Label("Enter Third Number:"));
        add(tno);
        tno.addActionListener(this);
    }
    /*public void actionPerformed(ActionEvent e)
    {
        int f= Integer.parseInt(fno.getText());
        int s= Integer.parseInt(sno.getText());
        int t= Integer.parseInt(tno.getText());
        public void paint(Graphics g)
        {
            if(f>s)
            {
                if(f>t)
                        g.drawString("Biggest number:"+f);
                else
                        g.drawString("Biggest number:"+t);
            }
            else
            {
                if(s>t)
                        g.drawString("Biggest number:"+s);
                else
                        g.drawString("Biggest number:"+t);
            }
        }
    }*/
}

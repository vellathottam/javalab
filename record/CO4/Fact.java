import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Fact_Applet extends Applet implements ActionListener,MouseListener
{
    int n,i,f=1;
    TextField t1=new TextField(15);
    TextField res=new TextField(15);
    Button b=new Button("Find");
    public void init()
    {
        add(new Label("Enter a range:"));
        add(t1);
        add(new Label("Result:"));
        add(res);
        add(b);
        b.addActionListener(this);
        addMouseListener(this);
    }
     public void mouseEntered(MouseEvent m)
        {
            showStatus("Mouse Entered");
        }
    public void actionPerformed(ActionEvent e)
    {
        n=Integer.parseInt(t1.getText());
        for(i=0;i>=1;i--)
        {
            f=f*i;
        }
         res.setText(f+"");
        repaint();
    }
   
}
/* <applet code="Fact.class" height="300" width="300">
</applet> */
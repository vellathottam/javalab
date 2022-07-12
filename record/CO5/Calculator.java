import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Calculator extends Applet implements ActionListener
{
        int a,b,res;
        TextField fno=new TextField(10);
        TextField sno=new TextField(10);
        TextField rno=new TextField(10);
        Button b1=new Button("+");
        Button b2=new Button("-");
        Button b3=new Button("*");
        Button b4=new Button("/");
        Button b5=new Button("%");
        Button b6=new Button("Clear");
        public void init()
        {
            add(new Label("Enter First Number:"));
            add(fno);
            add(new Label("Enter Second Number:"));
            add(sno);
            add(new Label("Result:"));
            add(rno);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e)
        {
            int a= Integer.parseInt(fno.getText());
            int b= Integer.parseInt(sno.getText());
            String S=e.getActionCommand();
            if(S.equals("+"))
            {
               res=a+b;
            }
            else if(S.equals("-"))
            {
                res=a-b;
            }
            else if(S.equals("*"))
            {
                res=a*b;
            }
            else if(S.equals("/"))
            {
                res=a/b;
            }
            else if(S.equals("%"))
            {
                res=a%b;
            }
            rno.setText(res+"");
            if(S.equals("Clear"))
            {
                fno.setText("");
                sno.setText("");
                rno.setText("");
            }
            repaint();
        }
        /*<applet code="Calculator.class" width=480 height=300>
        </applet>*/

}

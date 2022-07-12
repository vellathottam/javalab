import java.applet.Applet;  
import java.awt.Graphics;  
public class HelloWorld extends Applet{  
  
public void paint(Graphics g){  
g.drawString("welcome to applet",150,150);  
}  
  
}  
/* 
<applet code="HelloWorld.class" width="300" height="300"> 
</applet> 
*/ 
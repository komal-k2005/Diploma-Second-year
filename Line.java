
import java.awt.*;


import java.applet.*;


public class Line extends Applet

{

 public void init() 
{
      setBackground(Color.gray);
      setForeground(Color.yellow);
   }
public void paint(Graphics g)

{

g.drawOval(50,50,160,200);//Outer
g.drawOval(12,120,40,60);//R
g.drawOval(210,120,40,60);//L
g.drawOval(80,110,30,20);//R eye
g.drawOval(150,110,30,20);//L Eye
g.drawLine(130,130,130,180);
g.drawArc(95,130,70,80,180,180);
}
}
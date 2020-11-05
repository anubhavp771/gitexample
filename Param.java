import java.awt.*;
import java.applet.Applet;
 public class Param extends Applet
{
String name;
Font f = new Font("Times New Roman",Font.BOLD,40);
public void init()
{
name = getParameter("name");
if(name==null)
{
name ="Friend";
}
name="have a nice day"+name;
}
public void paint(Graphics g)
{
g.setFont(f);
g.drawString(name,100,100);
}
}
import java.awt.*;
import java.applet.*;
/*<applet code=smily width="200" height="200"></applet>*/
public class smily extends Applet
{
	public void paint(Graphics g)
	{
	g.setColor(Color.yellow);
	g.fillOval(100,100,100,100);
	g.setColor(Color.black);
	g.fillOval(120,125,20,25);
	g.fillOval(160,125,20,25);
	g.setColor(Color.blue);
	//g.drawLine(150,40,10,15);
	g.drawArc(125,150,50,40,180,180);
	}
}
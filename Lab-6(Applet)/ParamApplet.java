import java.applet.*;
import java.awt.*;
public class ParamApplet extends Applet
 {
 	
 	public void paint(Graphics g){
 		String a=getParameter("msg");
 		g.drawString(a,50,50);
 	}
 
}
/*
<applet code="ParamApplet.class" width="400" height="600">
<param name="msg" value="Arun ">
</applet>

*/
import java.applet.*;
import java.awt.*;
public class Sumapplet extends applet{
float a,b,Sum;
public void init(){
    a=2.5f;
    b=1.5f;
    sum=a+b;
    }
    public void paint(Graphics g){
    g.drawString("Sum=" +sum,20,20);
    }
}

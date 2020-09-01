import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(20, 30, 200, 200); // ¾ó±¼1
		g.setColor(Color.BLACK);
		g.drawArc(60, 80, 50, 50, 180, -180);
		g.drawArc(130, 80, 50, 50, 180, -180);
		g.drawArc(70, 130, 100, 70, 180, 180);
		
		g.setColor(Color.BLACK);
		g.fillOval(20, 330, 200, 200); // ¾ó±¼2
		g.setColor(Color.WHITE);
		g.fillOval(60, 400, 50, 50);
		g.fillOval(130, 400, 50, 50);
		g.setColor(Color.BLACK);
		g.fillOval(80, 400, 25, 25);
		g.fillOval(130, 400, 25, 25);
		g.setColor(Color.RED);
		g.fillOval(95, 460, 50, 50);
		
		
		g.setColor(Color.YELLOW);
		g.fillOval(320, 30, 200, 200); // ¾ó±¼3
		g.setColor(Color.BLACK);
		g.drawArc(360, 80, 50, 50, -180, 180);
		g.drawArc(430, 80, 50, 50, -180, 180);
		g.drawArc(370, 160, 100, 70, -180, -180);
		
		g.setColor(Color.WHITE);
		g.fillOval(320, 330, 200, 200); // ¾ó±¼4
		g.setColor(Color.BLACK);
		g.fillRoundRect(360, 400, 50, 50, 15, 15);
		g.fillRoundRect(430, 400, 50, 50, 15, 15);
		g.drawLine(410, 425, 430, 425);
		g.setColor(Color.RED);
		g.drawArc(370, 430, 100, 70, 180, 180);
	}
}
public class FrameChange4 extends JFrame{
	public FrameChange4(){
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("´«»ç¶÷ ¾ó±¼ 4°³");
		setVisible(true);
		add(new MyPanel());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameChange4 f = new FrameChange4();
	}

}

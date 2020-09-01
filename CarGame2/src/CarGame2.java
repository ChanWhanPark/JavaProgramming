import java.awt.Graphics;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.imageio.ImageIO;

class MyPanel extends JPanel {
	BufferedImage img = null;
	int img_x = 0, img_y = 0;
	int org_x = 0, org_y = 0;
	public MyPanel() {
	try {
		img = ImageIO.read(new File("car.gif"));
	} catch (IOException e) {
		System.out.println("No Image");
		System.exit(1);
	}
	addMouseListener(new MouseListener() {
		public void mousePressed(MouseEvent e) {
			org_x = img_x;
			org_y = img_y;
			img_x = e.getX();
			img_y = e.getY();
			repaint();
		}
		public void mouseExited(MouseEvent e) {
			img_x = org_x;
			img_y = org_y;
			repaint();
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
	});
	
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}
public class CarGame2 extends JFrame{
	public CarGame2() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarGame2 c = new CarGame2();
	}

}

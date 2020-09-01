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
	addKeyListener(new KeyListener(){
		public void keyReleased(KeyEvent e) {
			int keycode = e.getKeyCode();
			switch(keycode) {
			case KeyEvent.VK_UP:	img_y -= 10;	break;
			case KeyEvent.VK_DOWN:	img_y += 10;	break;
			case KeyEvent.VK_LEFT:	img_x -= 10;	break;
			case KeyEvent.VK_RIGHT:	img_x += 10;	break;
			case KeyEvent.VK_HOME:	img_x = 0; img_y = 0;	break;
			}
			repaint();
		}
		public void keyPressed(KeyEvent arg0) {}
		public void keyTyped(KeyEvent arg0) {}
	});
	
	this.requestFocus();
	setFocusable(true);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}
public class CarGame extends JFrame{
	public CarGame() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarGame c = new CarGame();
	}

}

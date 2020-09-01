import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class ImageFrame extends JFrame{
	BufferedImage img=null;
	public ImageFrame() {
		setTitle("이미지 테스트");
		try {
			img = ImageIO.read(new File("cat.jpg"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		add(new MyPanel());
		pack();
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		int width = img.getWidth(null) / 2;
		int height = img.getHeight(null) / 2;
		public void paint(Graphics g) {
			/* 좌우 반전
			g.drawImage(img, width, 0, 2*width, height, 0, 0, width, height, null);
			g.drawImage(img, width, height, 2*width, 2*height, 0, height, width, 2*height, null);
			g.drawImage(img, 0, 0, width, height, width, 0, 2*width, height, null);
			g.drawImage(img, 0, height, width, 2*height, width, height, 2*width, 2*height, null);
			*/
			/* 4등분 시계방향
			g.drawImage(img, width, 0, 2*width, height, 0, 0, width, height, null);
			g.drawImage(img, width, height, 2*width, 2*height, width, 0, 2*width, height, null);
			g.drawImage(img, 0, height, width, 2*height, width, height, 2*width, 2*height, null);
			g.drawImage(img, 0, 0, width, height, 0, height, width, 2*height, null);
			*/
			// 대각선
			g.drawImage(img, 0, 0, width, height, width, height, 2*width, 2*height, null);
			g.drawImage(img, width, height, 2*width, 2*height, 0, 0, width, height, null);
			g.drawImage(img, width, 0, 2*width, height, 0, height, width, 2*height, null);
			g.drawImage(img, 0, height, width, 2*height, width, 0, 2*width, height, null);
		}
		public Dimension getPreferredSize() {
			if (img == null)
				return new Dimension(100, 100);
			else
				return new Dimension(img.getWidth(null), img.getHeight(null));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageFrame();
	}

}

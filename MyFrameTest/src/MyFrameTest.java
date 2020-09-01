import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {

	public MyFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(800, 400);
		setLocation(screenSize.width / 2, screenSize.height / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		Image img = kit.getImage("Mushroom.gif");
		setIconImage(img);
		
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("안녕");
		JLabel label2 = new JLabel(label.getText());
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField("입력");
		JTextField t3 = new JTextField();
		t2.setEditable(false);
		button1.setText("왼쪽 버튼");
		button2.setText("중앙 버튼");
		button3.setText("오른쪽 버튼");
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(label2);
		button2.setEnabled(false);
		panel.add(t1);
		panel.add(t2);
		panel.add(t3);
		add(panel);
		setVisible(true);
	}
}

public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}

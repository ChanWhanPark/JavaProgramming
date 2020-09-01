import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

class MyFrame extends JFrame{
	private JButton button1;
	private JButton button2;
	private JLabel label;
	private JPanel panel;
	MyListener listener = new MyListener();
	public MyFrame() {
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		panel = new JPanel();
		label = new JLabel("현재 배경색은 없습니다.");
		button1 = new JButton("노란색");
		button1.addActionListener(listener);
		panel.add(button1);
		button2 = new JButton("분홍색");
		button2.addActionListener(listener);
		panel.add(button2);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				panel.setBackground(Color.YELLOW);
				label.setText("노란색 배경입니다.");
			}
			else if (e.getSource() == button2) {
				panel.setBackground(Color.PINK);
				label.setText("분홍색 배경입니다.");
			}
		}
	}
}
public class ActionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}

}

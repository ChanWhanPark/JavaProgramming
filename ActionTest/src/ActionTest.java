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
		this.setTitle("�̺�Ʈ ����");
		panel = new JPanel();
		label = new JLabel("���� ������ �����ϴ�.");
		button1 = new JButton("�����");
		button1.addActionListener(listener);
		panel.add(button1);
		button2 = new JButton("��ȫ��");
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
				label.setText("����� ����Դϴ�.");
			}
			else if (e.getSource() == button2) {
				panel.setBackground(Color.PINK);
				label.setText("��ȫ�� ����Դϴ�.");
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

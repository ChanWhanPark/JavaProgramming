import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	JRadioButton[] radio = new JRadioButton[3];
	String[] sizes = {"Small Size", "Medium Size", "Large SIze"};
	JLabel text;
	JPanel topPanel, sizePanel, resultPanel;
	
	public MyFrame(){
		setTitle("���� ��ư �׽�Ʈ");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("� �������� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		ButtonGroup size = new ButtonGroup();
		for(int i=0;i<3;i++) {
			radio[i] = new JRadioButton(sizes[i]);
			size.add(radio[i]);
			radio[i].addActionListener(this);
			sizePanel.add(radio[i]);
		}
		add(sizePanel, BorderLayout.CENTER);
		
		resultPanel = new JPanel();
		text = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == radio[0]) {
			text.setText("Small ũ�Ⱑ ���õǾ����ϴ�.");
		}
		if(e.getSource() == radio[1]) {
			text.setText("Medium ũ�Ⱑ ���õǾ����ϴ�.");
		}
		if(e.getSource() == radio[2]) {
			text.setText("Large ũ�Ⱑ ���õǾ����ϴ�.");
		}
	}
}
public class Last1205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
		String str = "abcdefghijklmnopqrstuvwxyz";
		char[] reverse_array = new char[str.length()];
		 for(int i=str.length() -1; i>=0; i--)
	      {
	           reverse_array[str.length() -1 -i]=str.charAt(i);
	      }
	}

}

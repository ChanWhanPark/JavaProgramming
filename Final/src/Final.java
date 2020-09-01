import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener{
	JPanel panel;
	JTextField field;
	JTextArea area;
	public MyFrame() {
		setTitle("2019년 2차 실습시험");
		setSize(410, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		addButton("삼각형", panel);
		addButton("역삼각형", panel);
		addButton("모래시계", panel);
		addButton("비우기", panel);
		addButton("종료", panel);
		add(panel, "North");
		field = new JTextField(30);
		field.addActionListener(this);
		add(field, BorderLayout.CENTER);
		
		area = new JTextArea(32, 30);
		area.setEditable(false);
		Font font = new Font("Monospaced", Font.PLAIN, 14);
		area.setFont(font);
		add(area, BorderLayout.SOUTH);
		
	
		setVisible(true);
	}
	
	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this);
		target.add(button);
	}
	
	public void actionPerformed(ActionEvent e) {
		String text = field.getText();
		int index = Integer.parseInt(text);
		if(e.getActionCommand().equals("삼각형")) {
			for(int i=1;i<=index;i++) {
				for(int j=index;j>=i;j--)
					area.append(" ");
				for(int k=1;k<=i;k++) {
					if(i <= 9)
						area.append(i + " ");
					else if(i >= 10)
						area.append(" " + (char)(i+87));
				}
				area.append("\n");
			}
		}
		else if(e.getActionCommand().equals("역삼각형")) {
			for(int i=index;i>=1;i--) {
				for(int j=index;j>=i;j--)
					area.append(" ");
				for(int k=1;k<=i;k++) {
					if(i <= 9) {
						area.append(i + " ");
					}
					else if(i >= 10)
						area.append(" " + (char)(i+87));
				}
				area.append("\n");
			}
		}
		else if(e.getActionCommand().equals("모래시계")) {
			for(int i=index;i>=1;i--) {
				for(int j=index;j>=i;j--)
					area.append(" ");
				for(int k=1;k<=i;k++) {
					if(i <= 9) {
						area.append(i + " ");
					}
					else if(i >= 10)
						area.append(" " + (char)(i+87));
				}
				area.append("\n");
			}
			for(int i=2;i<=index;i++) {
				for(int m=index-1;m>=i;m--)
					area.append(" ");
				for(int n=1;n<=i;n++)
					if(i <= 9) {
						area.append(" " + i);
					}
					else if(i >= 10)
						area.append(" " + (char)(i+87));
				area.append("\n");
			}
		}
		else if(e.getActionCommand().equals("비우기")){
			area.setText("");
		}
		else if(e.getActionCommand().equals("종료")) {
			System.exit(0);
		}
	}
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
		
	}

}

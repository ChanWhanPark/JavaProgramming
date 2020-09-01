import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame{
	private JButton button;
	private JTextField text1, text2, result;
	
	public MyFrame() {
		setSize(800, 300);
		setTitle("두 수 곱해서 결과 출력하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonListener listener = new ButtonListener();
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 두 개 입력: "));
		text1 = new JTextField(15);
		text1.addActionListener(listener);
		panel.add(text1);
		text2 = new JTextField(15);
		text2.addActionListener(listener);
		panel.add(text2);
		
		panel.add(new JLabel("두 수를 곱한 값: "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		setVisible(true);
		
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button || e.getSource() == text1 || e.getSource() == text2 && text1.getText().length() != 0 && text2.getText().length() != 0) {
				String name1 = text1.getText();
				String name2 = text2.getText();
				int value1 = Integer.parseInt(name1);
				int value2 = Integer.parseInt(name2);
				result.setText(" " + value1 * value2);
			}
				
		}
	}
}
public class Last1205_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}

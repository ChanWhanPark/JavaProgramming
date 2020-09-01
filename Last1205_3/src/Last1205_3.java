import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {
	JTextField textField;
	JTextArea textArea;
	int a = 0;
	public MyFrame() {
		setTitle("TextArea");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textField = new JTextField(30);
		textField.addActionListener(this);
		textArea = new JTextArea(10, 30);
		textArea.setEditable(false);
		
		add(textField, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}
	public void actionPerformed(ActionEvent evt) {
		String text = textField.getText();
		textArea.append(text + '\n');
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
		a++;
		if(a % 5 == 1) {
			textArea.setText("");
		}
			
	}
}
public class Last1205_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}

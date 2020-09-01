import java.awt.*;
import javax.swing.*;

class Frame extends JFrame{
	public Frame(){
		String str;
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ù ��° �׽�Ʈ ������ �ǽ�");
		
		JPanel panel = new JPanel();
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		
		JTextField t_input = new JTextField(32);
		JTextField t_output = new JTextField(32);
		JTextField t_dec = new JTextField(32);
		JTextField t_hex = new JTextField(32);
		
		t_input.setText("Korea Polytechnic University");
		t_dec.setText("14999");
		panel.add(t_input);
		panel.add(t_dec);
		
		str = t_input.getText();
		l1.setText("�Էµ� ���ڿ��� ���̴� " + str.length() + "�Դϴ�.");
		panel.add(l1);
		l2.setText("�Էµ� ���ڿ��� ���� ��°��� ������ �����ϴ�.");
		panel.add(l2);
		char[] reverse_array = new char[str.length()];
		for(int i = str.length()-1;i>=0;i--) {
			reverse_array[str.length()-1-i] = str.charAt(i);
		}
		t_output.setText(String.valueOf(reverse_array));
		panel.add(t_output);
		
		l3.setText("�Էµ� 10������ 16���� ǥ���� ������ �����ϴ�.");
		panel.add(l3);
		int dec_val = Integer.parseInt(t_dec.getText());
		char[] hex_out = new char[4];
		int remainder;
		for(int i=0;i<4;i++) {
			remainder = dec_val % 16;
			if(remainder < 10) {
				hex_out[3-i] = (char)(remainder + '0');
			}
			else
				hex_out[3-i] = (char)((remainder + 'A') - 10); 
			dec_val /= 16;
		}
		t_hex.setText(String.valueOf(hex_out));
		panel.add(t_hex);
		add(panel);
		setVisible(true);
	}
	
}

public class FrameChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
	}

}


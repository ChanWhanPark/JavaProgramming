import java.awt.*;
import javax.swing.*;

class Frame extends JFrame{
	public Frame(){
		String str;
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("첫 번째 테스트 프레임 실습");
		
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
		l1.setText("입력된 문자열의 길이는 " + str.length() + "입니다.");
		panel.add(l1);
		l2.setText("입력된 문자열의 역순 출력값은 다음과 같습니다.");
		panel.add(l2);
		char[] reverse_array = new char[str.length()];
		for(int i = str.length()-1;i>=0;i--) {
			reverse_array[str.length()-1-i] = str.charAt(i);
		}
		t_output.setText(String.valueOf(reverse_array));
		panel.add(t_output);
		
		l3.setText("입력된 10진수의 16진수 표현은 다음과 같습니다.");
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


import java.awt.*;
import javax.swing.*;

class Frame extends JFrame{
	public Frame() {
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("두 번째 테스트 프레임 실습");
		
		JPanel panel = new JPanel();
		JTextField j1 = new JTextField("Korea");
		JTextField j2 = new JTextField("Polytechnic");
		JTextField j3 = new JTextField("University");
		JTextField j4 = new JTextField("Loves");
		JTextField j5 = new JTextField("You");
		panel.add(j1);
		panel.add(j2);
		panel.add(j3);
		panel.add(j4);
		panel.add(j5);
		
		
		JTextField j6 = new JTextField(20);
		JTextField j7 = new JTextField(20);
		String[] input = new String[5];
		input[0] = j1.getText();
		input[1] = j2.getText();
		input[2] = j3.getText();
		input[3] = j4.getText();
		input[4] = j5.getText();
		int max_idx = 0, min_idx = 0;
		int [] input_strlen = new int[input.length];
		int min = input[0].length(), max = input[0].length();
		for(int i=0;i<input.length;i++) {
			if(input[i].length() < min) {
				min = input[i].length();
				min_idx = i;
			}
				
			if(input[i].length() > max) {
				max = input[i].length();
				max_idx = i;
			}
		}
		j6.setText(input[max_idx]);
		j7.setText(input[min_idx]);
		panel.add(j6);
		panel.add(j7);
		add(panel);
		setVisible(true);
}
}
public class FrameChange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
	}

}

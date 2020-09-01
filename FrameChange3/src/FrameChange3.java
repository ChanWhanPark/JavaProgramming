import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	JPanel panel;
	Cards cards;
	public MyFrame() {
		setTitle("CardLayoutTest");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0, 5, 10, 0));
		addButton("<<", panel);
		addButton("<", panel);
		addButton(">", panel);
		addButton(">>", panel);
		addButton("종료", panel);
		addButton("facebook", panel);
		addButton("instagram", panel);
		addButton("twitter", panel);
		addButton("calendar", panel);
		addButton("placeholder", panel);
		addButton("envelope", panel);
		addButton("internet", panel);
		addButton("phone-call", panel);
		addButton("search", panel);
		addButton("youtube", panel);
		add(panel, "North");
		cards = new Cards();
		add(cards, "Center");
		setVisible(true);
		
	}
	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this);
		target.add(button);
	}
	private class Cards extends JPanel{
		CardLayout layout;
		
		public Cards() {
			layout = new CardLayout();
			setLayout(layout);
			for(int i=1;i<=10;i++) {
				add(new JButton(new ImageIcon("SNS_facebook.png")), "facebook");
				add(new JButton(new ImageIcon("SNS_instagram.png")), "instagram");
				add(new JButton(new ImageIcon("SNS_twitter.png")), "twitter");
				add(new JButton(new ImageIcon("SNS_calendar.png")), "calendar");
				add(new JButton(new ImageIcon("SNS_placeholder.png")), "placeholder");
				add(new JButton(new ImageIcon("SNS_envelope.png")), "envelope");
				add(new JButton(new ImageIcon("SNS_internet.png")), "internet");
				add(new JButton(new ImageIcon("SNS_phone-call.png")), "phone-call");
				add(new JButton(new ImageIcon("SNS_search.png")), "search");
				add(new JButton(new ImageIcon("SNS_youtube.png")), "youtube");
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("종료"))
			System.exit(0);
		else if (e.getActionCommand().equals("<<"))
			cards.layout.first(cards);
		else if (e.getActionCommand().equals("<"))
			cards.layout.previous(cards);
		else if (e.getActionCommand().equals(">"))
			cards.layout.next(cards);
		else if (e.getActionCommand().equals(">>"))
			cards.layout.last(cards);
		else if (e.getActionCommand().equals("facebook"))
			cards.layout.show(cards, "facebook");
		else if (e.getActionCommand().equals("instagram"))
			cards.layout.show(cards, "instagram");
		else if (e.getActionCommand().equals("twitter"))
			cards.layout.show(cards, "twitter");
		else if (e.getActionCommand().equals("calendar"))
			cards.layout.show(cards, "calendar");
		else if (e.getActionCommand().equals("placeholder"))
			cards.layout.show(cards, "placeholder");
		else if (e.getActionCommand().equals("envelope"))
			cards.layout.show(cards, "envelope");
		else if (e.getActionCommand().equals("internet"))
			cards.layout.show(cards, "internet");
		else if (e.getActionCommand().equals("phone-call"))
			cards.layout.show(cards, "phone-call");
		else if (e.getActionCommand().equals("search"))
			cards.layout.show(cards, "search");
		else if (e.getActionCommand().equals("youtube"))
			cards.layout.show(cards, "youtube");
	}
}
public class FrameChange3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}

}

import java.util.Scanner;
class DiceGame{
	int dice;
	int guess;
	
	private void Rolldice() {
		dice = (int)(Math.random()*6)+1;
	}
	private int getUserInput(String prompt) {
		System.out.print(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	private void checkUserGuess() {
		if(dice == guess)
			System.out.println("�¾ҽ��ϴ�.");
		else
			System.out.println("Ʋ�Ƚ��ϴ�.");
	}
	public void startPlaying() {
		guess = getUserInput("������ �Է��ϼ���: ");
		Rolldice();
		checkUserGuess();
	}
}

public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiceGame game = new DiceGame();
		game.startPlaying();
	}
}

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
			System.out.println("맞았습니다.");
		else
			System.out.println("틀렸습니다.");
	}
	public void startPlaying() {
		guess = getUserInput("예상값을 입력하세요: ");
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

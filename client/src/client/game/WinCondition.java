package client.game;

public class WinCondition {

	private int score1;
	private int score2;
	private Game game;

	public WinCondition(Game game, int score1, int score2) {
		this.score1 = score1;
		this.score2 = score2;
		this.game = game;
		changeScore();
	}

	public void changeScore() {
		System.out.println(score1);
		System.out.println(score2);

		if (score1 == score2) {
			return;
		}
		if ((score1 == 1 && score2 == 3) || (score1 == 2 && score2 == 1) || (score1 == 3 && score2 == 2)) {
			game.addAiScore();
		}
		if ((score2 == 1 && score1 == 3) || (score2 == 2 && score1 == 1) || (score2 == 3 && score1 == 2)) {
			game.addPlayerScore();
		}

	}
}

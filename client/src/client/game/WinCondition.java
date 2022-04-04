package client.game;

public class WinCondition {
	
	private int score1;
	private int score2;
	private Game game;
	
	public WinCondition(Game game, int score1, int score2) {
		this.score1 = score1;
		this.score2 = score2;
		this.game = game;
	}
	
	
}

package client.game;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//Luca A
public class Game {
	
	private Scanner theScanner;
	private int aiPick;
	private int playerChoice;
	
	private int playerScore = 0;
	private int aiScore = 0;
	private String userName;
	private String botName;
	private String[] botNames = {"Laika", "Charles Babbage", "Alan Turing", "Ada Lovelace", "Ghost of RPS", "Someone You Know"};
	
	public Game(Scanner theScanner, String userName) {
		this.theScanner = theScanner;
		this.userName = userName;
		botName = botNames[ThreadLocalRandom.current().nextInt(1,botNames.length)];
		gameMenu();
	}
	
	private void displayString() {
		System.out.println(userName + " " + Integer.toString(playerScore) + " - " + Integer.toString(aiScore) + " " + botName);
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissors");
	}
	
	private void gameMenu() {
		displayString();
		String playerSay;
		int choice = theScanner.nextInt();
	
			switch(choice) {
			case 1:
				playerChoice = 1;
				playerSay = "Rock!";
				break;
			case 2:
				playerChoice = 2;
				playerSay = "Paper!";
				break;
			case 3:
				playerChoice = 3;
				playerSay = "Scissors!";
				break;
			default:
				playerChoice = 3;
				playerSay = "Scissors!";
				break;
			}
			
		System.out.println(" ");
		System.out.println(userName + ": " + playerSay);
	
		aiPick = ThreadLocalRandom.current().nextInt(1,3);
		String aiSay = null;
		switch(aiPick) {
		case 1:
			aiSay = "Rock!";
			break;
		case 2:
			aiSay = "Paper!";
			break;
		case 3:
			aiSay = "Scissors!";
			break;
		}
		System.out.println(botName + ": " + aiSay);
		System.out.println(" ");
		WinCondition checkResult = new WinCondition(this, aiScore, playerScore);		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		gameMenu();
	}
	
	public void addAiScore() {
		aiScore++;
	}
	
	public void addPlayerScore() {
		playerScore++;
	}
	
	
	
}

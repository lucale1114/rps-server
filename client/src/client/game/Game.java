package client.game;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import client.MainMenu;
import client.Player;

//Luca A
public class Game {
	
	private Scanner theScanner;
	private int aiPick;
	private int playerChoice;
	private MainMenu mainMenu;
	
	private int playerScore = 0;
	private int aiScore = 0;
	private String username;
	private Player plr;
	private String botName;
	private String[] botNames = {"Laika", "Charles Babbage", "Alan Turing", 
			"Ada Lovelace", "Diogenes", "Chris Sawyer",
			"Jon Skeet", "Jun'ya Ota", "Paul Romero", "Robin Walker"};
	
	public Game(Scanner theScanner, Player plr, MainMenu mainMenu) {
		this.theScanner = theScanner;
		this.plr = plr;
		this.mainMenu = mainMenu;
		username = this.plr.getUsername();
		botName = botNames[ThreadLocalRandom.current().nextInt(0,botNames.length)];
		gameMenu();
	}
	
	private void displayString() {
		System.out.println(username + " " + Integer.toString(playerScore) + " - " + Integer.toString(aiScore) + " " + botName);
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
		System.out.println(username + ": " + playerSay);
	
		aiPick = ThreadLocalRandom.current().nextInt(1,4);
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
		new WinCondition(this, aiPick, choice);	
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		if (playerScore == 5) {
			plr.setWins(plr.getWins() + 1);
			System.out.println();
			System.out.println("You win!");
			mainMenu.displayMainMenu();
			mainMenu.makeAChoice();
			return;
		}
		else if (aiScore == 5) {
			System.out.println();
			System.out.println("You lose!");
			plr.setDefeats(plr.getDefeats() + 1);
			mainMenu.displayMainMenu();
			mainMenu.makeAChoice();
			return;
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

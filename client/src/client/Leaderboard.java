package client;

import java.util.Scanner;

public class Leaderboard {

	private Scanner theScanner;
	private DataInputOutput data;
	private MainMenu mainMenu;

	public Leaderboard(MainMenu mainMenu) {
		this.mainMenu = mainMenu;
	}

	public void displayLeaderboard() {
		System.out.println("Leaderboard:");
		System.out.println("1. See leaderboard");
		System.out.println("2. Search for player");
		System.out.println("3. Back to main menu");
	}

	public void makeAChoice() {
		int choice = theScanner.nextInt();
		boolean choiceMade = false;
		while (choiceMade == false) {
			choiceMade = true;
			switch (choice) {
			case 1:
				System.out.println("Leaderboard:");
				data.getAllPlayers();
				choiceMade = false;
				displayLeaderboard();
				choice = theScanner.nextInt();
				break;
			case 2:
				System.out.println("Write a username:");
				data.getPlayerInfo(theScanner.next());
				choiceMade = false;
				displayLeaderboard();
				choice = theScanner.nextInt();
				break;
			case 3:
				mainMenu.displayMainMenu();
				mainMenu.makeAChoice();
				break;
			default:
				choiceMade = false;
				System.out.println("Invalid option.");
				choice = theScanner.nextInt();
				break;
			}
		}
	}

}

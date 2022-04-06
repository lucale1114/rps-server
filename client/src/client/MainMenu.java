package client;

import java.util.Scanner;

import client.game.Game;

public class MainMenu {

	private Scanner theScanner;
	private String username;
	private Player plr;
	private DataInputOutput data;
	
	
	public void displayMainMenu() {
		System.out.println("Welcome to RPS, " + username + "!");
		System.out.println("1. Play");
		System.out.println("2. Players");
		System.out.println("3. Register");
		System.out.println("4. Exit");
	}

	public MainMenu() {
		theScanner = new Scanner(System.in);
		username = "Guest";
		data = new DataInputOutput();
		displayMainMenu();
		makeAChoice();
	}

	public void makeAChoice() {
		int choice = theScanner.nextInt();
		boolean choiceMade = false;
		while (choiceMade == false) {
			choiceMade = true;
			switch (choice) {
			case 1:
				if (plr != null) {
					Game newGame = new Game(theScanner, plr, this);
				}
				else
				{
					System.out.println("You need an account to play!");
					choiceMade = false;
					choice = 3;
				}
				break;
			case 2:
				new Leaderboard(this, theScanner);
				break;
			case 3:
				System.out.println("Enter username.");
				String user = theScanner.next();
				System.out.println("Enter password.");
				String password = theScanner.next();
				System.out.println("Registered!");
				System.out.println();
				plr = new Player();
				plr.setUsername(user);
				plr.setPassword(password);
			    username = plr.getUsername();
				displayMainMenu();
				choiceMade = false;
				choice = theScanner.nextInt();
				break;
			case 4:
				data.register(plr);
				System.exit(0);
				break;
			default:
				choiceMade = false;
				System.out.println("Invalid option.");
				choice = theScanner.nextInt();
				break;

			}
		}
	}

	public Scanner getTheScanner() {
		return theScanner;
	}
}

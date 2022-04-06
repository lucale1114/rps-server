package client;

import java.util.Scanner;

import client.game.Game;

public class MainMenu {

	private Scanner theScanner;
	private String username;
	private Player plr;
	private DataInputOutput data;
	
	public MainMenu() {
		theScanner = new Scanner(System.in);
		username = "Guest";
		data = new DataInputOutput();
		displayMainMenu();
		makeAChoice();
	}
	
	public void displayMainMenu() {
		System.out.println("Welcome to RPS, " + username + "!");
		System.out.println("1. Play");
		System.out.println("2. Login");
		System.out.println("3. Players");
		System.out.println("4. Register");
		System.out.println("5. Exit");
	}


	public void makeAChoice() {
		int choice = theScanner.nextInt();
		boolean choiceMade = false;
		while (choiceMade == false) {
			choiceMade = true;
			switch (choice) {
			case 1:
				Game newGame = new Game(theScanner, plr, this);
				break;
			case 2:
				
				break;
			case 3:
				data.getAllPlayers();
				break;
			case 4:
				System.out.println("Enter username.");
				String user = theScanner.next();
				System.out.println("Enter password.");
				String password = theScanner.next();
				System.out.println("Registered!");
				plr = new Player();
				plr.setUsername(user);
				plr.setPassword(password);
			    username = plr.getUsername();
				displayMainMenu();
				choiceMade = false;
				choice = theScanner.nextInt();
				break;
			case 5:
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

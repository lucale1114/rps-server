package client;

import java.util.Scanner;

import client.game.Game;

public class MainMenu {
	
	private Scanner theScanner;
	private String userName;
	
	private void displayMainMenu() {
		System.out.println("Welcome to RPS, " + userName + "!");
		System.out.println("1. Play");
		System.out.println("2. Login");
		System.out.println("3. Players");
		System.out.println("4. Register");
		System.out.println("5. Exit");
	}
	
	public MainMenu() {
		theScanner = new Scanner(System.in);
		userName = "Guest";
		displayMainMenu();
		makeAChoice();
	}
	
	public void makeAChoice() {
		int choice = theScanner.nextInt();
		boolean choiceMade = false;
		while (choiceMade == false) {
			choiceMade = true;
			switch(choice) {
				case 1:
					Game newGame = new Game(theScanner, userName);
				break;
				case 2:
					
				break;
				case 3:
					
				break;
				case 4:
					
				break;
				case 5:
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

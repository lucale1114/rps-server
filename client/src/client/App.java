package client;
public class App {
	public static void main(String[] args) {
		System.out.println("Booted game!");
		DataInputOutput d = new DataInputOutput();
		d.getPlayerInfo("person");
		MainMenu menu = new MainMenu();
	}
}

package client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class DataInputOutput {
	
	public void register(Player player) {
		Client client = ClientBuilder.newClient();

		Entity plr = Entity.entity(player, "application/JSON");

		Response response = client.target("http://localhost:8080/RPSLeaderboard/stats/players").request()
				.buildPost(plr).invoke();

		response.close();
		client.close();
	}
	
	public void getAllPlayers() {
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/RPSLeaderboard/stats/players").request().buildGet()
				.invoke();

		List<Player> players = response.readEntity(new GenericType<List<Player>>() {
		});

		int i = 0;
		for (Player p : players) {
			i++;
			System.out.println(i + ". " + p.getUsername() + " - Wins: " + p.getWins() + " - Defeats: " + p.getDefeats());
			if (i == 20) {
				break;
			}
		}

		response.close();
		client.close();
	}
	
	public void getPlayerInfo(String username) {
		Client client = ClientBuilder.newClient();
		// Safe?
		Response response = client.target("http://localhost:8080/RPSLeaderboard/stats/players/" + username).request().buildGet()
				.invoke();

		Player guy = response.readEntity(Player.class);
	
		System.out.println();
		System.out.println("Showing info for:");
		System.out.println(guy.getUsername());
		System.out.println("---");
		System.out.println("Wins: " + guy.getWins());
		System.out.println("Defeats: " + guy.getDefeats());
		System.out.println();
		
		response.close();
		client.close();
	}
}



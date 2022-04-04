package client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class DataInputOutput {
	public void adfjoadsf() {
		Client client = ClientBuilder.newClient();

		Player ben = new Player();
		ben.setUsername("Ben");
		ben.setPassword("Tester");
		ben.setWins(1000);
		ben.setDefeats(1000);

		Entity benEntity = Entity.entity(ben, "application/JSON");

		Response response = client.target("http://localhost:8080/EmployeeManagement/webservice/employees").request()
				.buildPost(benEntity).invoke();

		System.out.println(response.readEntity(Player.class).getId());
		response.close();

		response = client.target("http://localhost:8080/EmployeeManagement/webservice/employees").request().buildGet()
				.invoke();

		List<Player> players = response.readEntity(new GenericType<List<Player>>() {
		});

		for (Player p : players) {
			System.out.println(p);
		}

		response.close();
}}

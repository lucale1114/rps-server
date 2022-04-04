package server.rps.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import server.rps.entity.Player;
import server.rps.service.RPSService;

@Stateless
@Path("/players")
public class Rest {

	@Inject
	private RPSService service;

	@GET
	@Produces("application/JSON")
	public List<Player> getPlayers() {
		return service.getPlayers();
	}

	@GET
	@Produces("application/JSON")
	@Path("{playerName}")
	public Player getPlayer(@PathParam("playerName") String username) {
		return service.getPlayer(username);
	}

	@POST
	@Produces("application/JSON")
	@Consumes("application/JSON")
	public Player registerPlayer(Player player) {
		service.registerPlayer(player);
		return player;
	}
}

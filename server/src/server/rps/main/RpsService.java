package server.rps.main;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Local
public interface RpsService {
	
	public List<Player> getPlayers();
	
	public Player registerPlayer(Player player);
	
	public Player getPlayer(playerName);
	   
	   

}

 

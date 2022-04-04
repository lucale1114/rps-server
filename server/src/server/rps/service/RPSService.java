package server.rps.service;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import server.rps.entity.Player;

@Local
public interface RPSService {
	
	public List<Player> getPlayers();
	
	public Player registerPlayer(Player player);
	
	public Player getPlayer(String userName);
	   
	   

}

 

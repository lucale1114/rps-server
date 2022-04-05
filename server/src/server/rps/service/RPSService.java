package server.rps.service;

import java.util.List;

import javax.ejb.Local;

import server.rps.domain.Player;

// Eleni

@Local
public interface RPSService {
	
	public List<Player> getPlayers();
	
	public void registerPlayer(Player player);
	
	public Player getPlayer(String username);
	   
	   

}

 

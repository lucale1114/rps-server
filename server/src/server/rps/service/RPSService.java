package server.rps.service;

import java.util.List;

import javax.ejb.Local;

import server.rps.entity.Player;

@Local
public interface RPSService {
	
	public List<Player> getPlayers();
	
	public void registerPlayer(Player player);
	
	public Player getPlayer(String username);
	   
	   

}

 

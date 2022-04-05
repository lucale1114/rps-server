package server.rps.dataaccess;

import java.util.List;

import javax.ejb.Local;

import server.rps.domain.Player;

@Local
public interface PlayerDataAccess {

	public List<Player> retrievePlayers();
	
	public Player retrievePlayerByUsername(String username);
	
	public void registerPlayer(Player newPlayer);
	
}

package server.rps.dataaccess;

import java.util.List;

import javax.ejb.Local;

import server.rps.entity.Player;

@Local
public interface PlayerDataAccess {

	public List<Player> retrievePlayers();
	
	public Player retrievePlayer();
	
	public void registerPlayer();
	
}

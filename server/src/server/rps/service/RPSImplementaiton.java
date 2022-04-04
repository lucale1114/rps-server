package server.rps.service;

import java.util.List;

import javax.ejb.Stateless;

import com.google.inject.Inject;

import server.rps.dataaccess.PlayerDataAccess;
import server.rps.entity.Player;

@Stateless
public class RPSImplementaiton implements RPSService {

	
	@Inject 
	private PlayerDataAccess dao;
	@Override
	public List<Player> getPlayers() {
		return dao.retrievePlayers();
	}

	public void registerPlayer(Player newPlayer) {
		
		dao.registerPlayer(newPlayer);
	}

	@Override
	public Player getPlayer(String userName) {
		
		return dao.retrievePlayerByUsername(userName);
	}


}

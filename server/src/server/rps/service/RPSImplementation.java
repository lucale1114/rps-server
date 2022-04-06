package server.rps.service;

import java.util.List;

import javax.ejb.Stateless;

import server.rps.dataaccess.PlayerDataAccess;
import server.rps.domain.Player;

//Eleni

@Stateless
public class RPSImplementation implements RPSService {

	@javax.inject.Inject
	private PlayerDataAccess dao;

	public List<Player> getPlayers() {
		return dao.retrievePlayers();
	}

	public void registerPlayer(Player newPlayer) {

		dao.registerPlayer(newPlayer);
	}

	public Player getPlayer(String userName) {

		return dao.retrievePlayerByUsername(userName);
	}

}

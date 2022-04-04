package server.rps.dataaccess;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import server.rps.entity.Player;

@Stateless
@Default
public class PlayerDataAccessProductionVersion implements PlayerDataAccess {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Player> retrievePlayers() {
		Query q = em.createQuery("select player from Player player");
		List<Player> players = q.getResultList();
		return players;
	}

	@Override
	public Player retrievePlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerPlayer() {
		// TODO Auto-generated method stub
		
	}

}

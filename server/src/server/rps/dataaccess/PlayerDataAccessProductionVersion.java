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
	public Player retrievePlayerByUsername(String username) {
		Query q = em.createQuery("select player from Player player where player.username = :username");
		q.setParameter("username", username);
		return (Player) q.getSingleResult();
	}

	@Override
	public void registerPlayer(Player newPlayer) {
		em.persist(newPlayer);
	}

}

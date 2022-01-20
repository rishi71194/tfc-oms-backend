package SCMProject.Prakat.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SCMProject.Prakat.model.BonusPenalty;

@Repository
public class BonusPenaltyDaoImpl implements BonusPenaltyDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<BonusPenalty> getAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<BonusPenalty> query = currentSession.createQuery("from BonusPenalty", BonusPenalty.class);
		List<BonusPenalty> list = query.getResultList();
		return list;
	}

}

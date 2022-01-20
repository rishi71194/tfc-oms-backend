package SCMProject.Prakat.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SCMProject.Prakat.model.DemandDelivery;

@Repository
public class DemandDeliveryDaoImpl implements DemandDeliveryDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<DemandDelivery> getAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<DemandDelivery> query = currentSession.createQuery("from DemandDelivery", DemandDelivery.class);
		List<DemandDelivery> list = query.getResultList();
		return list;
	}

}

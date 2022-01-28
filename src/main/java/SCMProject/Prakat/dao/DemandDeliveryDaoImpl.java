package SCMProject.Prakat.dao;

import java.util.List;

import javax.persistence.EntityManager;

import SCMProject.Prakat.model.Production;
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

	@Override
	public List<DemandDelivery> getByDateID(int id){
		Session currentSession = entityManager.unwrap(Session.class);
		Query<DemandDelivery> query = currentSession.createQuery("from DemandDelivery where dateID ="+id, DemandDelivery.class);
		List<DemandDelivery> list = query.getResultList();
		return list;
	}

	@Override
	public List<DemandDelivery> getByCustomerProduct(int cid, int pid){
		Session currentSession = entityManager.unwrap(Session.class);
		String condition=" where demand>delivery and productID ="+pid+"";
		if(cid>0)
		{
			condition+=" and customerID="+cid;
		}
		Query<DemandDelivery> query = currentSession.createQuery("from DemandDelivery"+condition);
		List<DemandDelivery> list = query.getResultList();
		System.out.println(list.toString());
		return list;
	}

	@Override
	public List<DemandDelivery> getByCustomerProductWeek(int year, int week){
		Session currentSession = entityManager.unwrap(Session.class);
		Query<DemandDelivery> query = currentSession.createQuery("from DemandDelivery where demand>delivery and productID=" +year+" and customerID="+week, DemandDelivery.class);
		List<DemandDelivery> list = query.getResultList();
		return list;
	}


}

package SCMProject.Prakat.dao;

import java.util.List;

import javax.persistence.EntityManager;

import SCMProject.Prakat.model.DateDim;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SCMProject.Prakat.model.DemandDelivery;

@Repository
public class DemandDeliveryDaoImpl implements DemandDeliveryDao {

	@Autowired
	private EntityManager entityManager;

	@Autowired
	DateDimDao dateDimDao;


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
		return list;
	}

	@Override
	public List<DemandDelivery> getByDemandPerWeek(int year, int week, int cid, int pid){
		List<DateDim> dates= dateDimDao.getByYearAndWeek(year, week);
		int start = dates.get(0).getDateID();
		int end = dates.get(dates.size()-1).getDateID();
		Session currentSession = entityManager.unwrap(Session.class);
		String sql="select productID, customerID, dateID, sum(delivery) as delivery,"
				+ "sum(demand) as demand from DemandDelivery where dateID>="+start+" and dateID<="+end+" ";
		Query<DemandDelivery> query = currentSession.createQuery(sql);
		List<DemandDelivery> total = query.getResultList();
		return total;
	}

}

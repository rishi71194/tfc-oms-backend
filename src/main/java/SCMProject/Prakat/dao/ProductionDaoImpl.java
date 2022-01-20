package SCMProject.Prakat.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SCMProject.Prakat.model.Production;

@Repository
public class ProductionDaoImpl implements ProductionDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Production> getAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Production> query = currentSession.createQuery("from Production", Production.class);
		List<Production> list = query.getResultList();
		return list;
	}

	@Override
	public List<Production> getProductionByDateIDAndProductID(int dateID, int productID) {
		Session currentSession = entityManager.unwrap(Session.class);
		String condition=" where dateID ="+dateID+"";
		if(productID>0)
		{
			condition+=" and productID="+productID;
		}
		Query<Production> query = currentSession.createQuery("from Production"+condition);
		List<Production> list = query.getResultList();
		return list;
	}

	@Override
	public List<Production> getProductionByDateID(int dateID, int productID) {
		Session currentSession = entityManager.unwrap(Session.class);
		String condition=" where dateID ="+dateID+"";
		if(productID>0)
		{
			condition+=" and productID="+productID;
		}
		Query<Production> query = currentSession.createQuery("from Production"+condition);
		List<Production> list = query.getResultList();
		return list;
	}

	@Override
	public List<Production> getProductionByDateRange(int startdateid, int enddateid, int productID) {
		Session currentSession = entityManager.unwrap(Session.class);
		String sql="select productID,sum(deliveryFromProduction) as deliveryFromProduction,"
				+ "sum(obsoletes) as obsoletes,"
				+ "sum(startupLoss) as startupLoss,"
				+ "sum(inBackorder) as inBackorder,"
				+ "sum(rejection) as rejection from Production where dateID>="+startdateid+" and dateID<="+enddateid+" ";
		if(productID>0)
		{
			sql+=" and productID="+productID;
		}
		sql+=" group by productID";
		Query query = currentSession.createQuery(sql);
		List<Object[]>  list = query.getResultList();
//		List<Object[]> results = currentSession.createQuery(sql).getResultList();

		List<Production> newlist= new ArrayList<Production>();
		
		for (Object[] object : list) {
				
			System.out.println(object[0]+"  --  "+ object[1]+"  --  "+ object[2]+"  --  "+ object[3]+"  --  "+ object[4]+"  --  "+ object[5]);
				Production ob = new Production();
				ob.setDateID(enddateid);
				ob.setProductID((int)object[0]);
				ob.setDeliveryFromProduction((int) (long)object[1]);
				ob.setInBackorder((int) (long)object[4]);
				ob.setObsoletes((int) (long)object[2]);
				ob.setStartupLoss((int) (long)object[3]);
				ob.setRejection((int) (long)object[5]);
				newlist.add(ob);
		}
		
		//System.out.println(newlist.toString());
		return newlist;
	}

}

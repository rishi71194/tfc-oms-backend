package SCMProject.Prakat.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import SCMProject.Prakat.model.ShelfLife;

@Repository
public class ShelfLifeDaoImpl implements ShelfLifeDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<ShelfLife> getAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<ShelfLife> query = currentSession.createQuery("from ShelfLife", ShelfLife.class);
		List<ShelfLife> list = query.getResultList();
		return list;
	}

	@Override
	public List<ShelfLife> getByShelfLifeAndCustomerID(int slife, int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		String condition=" where shelfLife ="+slife+"";
		if(id>0)
		{
			condition+=" and customerID="+id;
		}
		Query<ShelfLife> query = currentSession.createQuery("from ShelfLife"+condition);			
		List<ShelfLife> list = query.list();
			for (int i = 0; i < list.size(); i++) {
			   //System.out.println(list.get(i).getContractindex());//
				ShelfLife ob = list.get(i);
				
				ob.setContractindex((1+ob.getContractindex()));
				list.set(i, ob);
			}		
		return list;
	}

}

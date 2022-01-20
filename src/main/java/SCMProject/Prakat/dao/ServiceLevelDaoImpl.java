package SCMProject.Prakat.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SCMProject.Prakat.model.ServiceLevel;

@Repository
public class ServiceLevelDaoImpl implements ServiceLevelDao{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<ServiceLevel> getAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<ServiceLevel> query = currentSession.createQuery("from ServiceLevel", ServiceLevel.class);
		List<ServiceLevel> list = query.getResultList();
		return list;
	}

	@Override
	public List<ServiceLevel> getByServiceAndCustomerId(int level, int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		String condition=" where service ="+level+"";
		if(id>0)
		{
			condition+=" and customerID="+id;
		}
		Query<ServiceLevel> query = currentSession.createQuery("from ServiceLevel"+condition);			
		List<ServiceLevel> list = query.list();
		
			for (int i = 0; i < list.size(); i++) {
			   //System.out.println(list.get(i).getContractindex());//
				ServiceLevel ob = list.get(i);
				
				ob.setContractindex((1+ob.getContractindex()));
				list.set(i, ob);
			}
			
		return list;
	}


}

package SCMProject.Prakat.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SCMProject.Prakat.model.CustomerDim;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private EntityManager entityManager;
	

	@Override
	public List<CustomerDim> getAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<CustomerDim> query = currentSession.createQuery("from CustomerDim", CustomerDim.class);
		List<CustomerDim> list = query.getResultList();
		return list;

	}

	public CustomerDim getCustomerByID(Integer id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<CustomerDim> query = currentSession.createQuery("from CustomerDim where customerId = " + id, CustomerDim.class);
		CustomerDim list = query.getSingleResult();
		return list;
	}

	@Override
	public void save(CustomerDim customerDim) {		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(customerDim);
	}
	


}

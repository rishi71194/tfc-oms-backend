package SCMProject.Prakat.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SCMProject.Prakat.model.ProductDim;

@Repository
public class ProductDimDaoImpl implements ProductDimDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<ProductDim> getAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		Query<ProductDim> query = currentSession.createQuery("from ProductDim", ProductDim.class);
		List<ProductDim> list = query.getResultList();
		return list;
	}

}

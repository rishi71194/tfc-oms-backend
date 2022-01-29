package SCMProject.Prakat.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SCMProject.Prakat.model.DateDim;

@Repository
public class DateDimDaoImpl implements DateDimDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<DateDim> getAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<DateDim> query = currentSession.createQuery("from DateDim", DateDim.class);
		List<DateDim> list = query.getResultList();
		return list;
	}

	@Override
	public DateDim getByDate(String date) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<DateDim> query = currentSession.createQuery("from DateDim where edate='" + date + "'");
		DateDim ob = query.getSingleResult();
		return ob;
	}


	@Override
	public List<DateDim> getByYearAndMonth(int year, int month) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<DateDim> query = currentSession.createQuery("from DateDim where yearNumber="+year+" and monthNumber="+month+" ");
		List<DateDim> list = query.getResultList();
		return list;
	}

	@Override
	public List<DateDim> getByYearAndWeek(int year, int week) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<DateDim> query = currentSession.createQuery("from DateDim where yearNumber="+year+" and weekNumber="+week+" ");
		List<DateDim> list = query.getResultList();
		return list;
	}

}

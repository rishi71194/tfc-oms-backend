package SCMProject.Prakat.dao;

import java.util.List;

import javax.persistence.EntityManager;

import SCMProject.Prakat.model.DateDim;
import SCMProject.Prakat.model.DemandDelivery;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SCMProject.Prakat.model.ServiceLevel;

@Repository
public class ServiceLevelDaoImpl implements ServiceLevelDao{

	@Autowired
	private EntityManager entityManager;

	@Autowired
	DateDimDao date;

	@Autowired
	DemandDeliveryDao demandDelivery;

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

	@Override
	public String getServiceLevelByDate(String startDate, String endDate){
		DateDim ob1=date.getByDate(startDate);
		int startDateId=ob1.getDateID();
		DateDim ob2=date.getByDate(endDate);
		int endDateId=ob2.getDateID();

		List<DemandDelivery> op1=demandDelivery.getByDateID(startDateId);
		int demand=0;
		int delivery=0;
		int count1=0,total1=op1.size();
		for(DemandDelivery i:op1) {
			demand=i.getDemand();
			delivery=i.getDelivery();
			if(demand-delivery>0) {
				count1++;
			}
		}

		List<DemandDelivery> op2=demandDelivery.getByDateID(endDateId);
		int count2=0,total2=op2.size();
		double percentage=0.0;
		for(DemandDelivery j:op2) {
			demand=j.getDemand();
			delivery=j.getDelivery();
			if(demand-delivery>0) {
				count2++;
			}
			percentage=(((total1+total2)-(count1+count2))*100)/(total1+total2);
		}
		return percentage+"%";
	}

	@Override
	public String getServiceLevelByOrderLine(String startDate, String endDate, int pid, int cid) {

		return "";
	}


}

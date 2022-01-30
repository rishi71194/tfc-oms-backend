package SCMProject.Prakat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SCMProject.Prakat.dao.DemandDeliveryDao;
import SCMProject.Prakat.model.DemandDelivery;

@Service
public class DemandDeliveryServiceImpl implements DemandDeliveryService {

	@Autowired
	private DemandDeliveryDao demandDeliveryDao;
	
	@Override
	public List<DemandDelivery> getAll() {

		return demandDeliveryDao.getAll();
	}

	@Override
	public List<DemandDelivery> getByDateID(int d) {

		return demandDeliveryDao.getByDateID(d);
	}

	@Override
	public List<DemandDelivery> getByCustomerProduct(int cid, int pid) {

		return demandDeliveryDao.getByCustomerProduct(cid, pid);
	}

	@Override
	public List<DemandDelivery> getByCustomerProductWeek(int year, int week) {

		return demandDeliveryDao.getByCustomerProduct(year, week);
	}

	@Override
	public List<DemandDelivery> getByDemandPerWeek(int year, int week, int cid, int pid) {
		return demandDeliveryDao.getByDemandPerWeek(year, week, cid, pid);
	}

}

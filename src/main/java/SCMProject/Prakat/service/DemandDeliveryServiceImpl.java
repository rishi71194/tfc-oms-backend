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

}

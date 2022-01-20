package SCMProject.Prakat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SCMProject.Prakat.dao.ProductionDao;
import SCMProject.Prakat.model.Production;

@Service
public class ProductionServiceImpl implements ProductionService {

	@Autowired
	private ProductionDao productionDao;
	
	@Override
	public List<Production> getAll() {
	
		return productionDao.getAll();
	}

	@Override
	public List<Production> getProductionByDateIDAndProductID(int dateID, int productID) {

		return productionDao.getProductionByDateIDAndProductID(dateID, productID);
	}

	@Override
	public List<Production> getProductionByDateID(int dateID, int productID) {

		return productionDao.getProductionByDateID(dateID,productID);
	}

	@Override
	public List<Production> getProductionByDateRange(int startdateid, int enddateid, int productID) {

		return productionDao.getProductionByDateRange(startdateid,enddateid,productID);
	}

}

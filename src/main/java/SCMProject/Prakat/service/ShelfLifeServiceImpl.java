package SCMProject.Prakat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SCMProject.Prakat.dao.ShelfLifeDao;
import SCMProject.Prakat.model.ShelfLife;

@Service
public class ShelfLifeServiceImpl implements ShelfLifeService {

	@Autowired
	private ShelfLifeDao shelfLifeDao;
	
	@Override
	public List<ShelfLife> getAll() {

		return shelfLifeDao.getAll();
	}

	@Override
	public List<ShelfLife> getByShelfLifeAndCustomerID(int slife, int id) {
		return shelfLifeDao.getByShelfLifeAndCustomerID(slife, id);
	}

}

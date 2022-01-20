package SCMProject.Prakat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SCMProject.Prakat.dao.ProductDimDao;
import SCMProject.Prakat.model.ProductDim;

@Service
public class ProductDimServiceImpl implements ProductDimService {

	@Autowired
	private ProductDimDao productDimDao;
	
	@Override
	public List<ProductDim> getAll() {

		return productDimDao.getAll();
	}

}

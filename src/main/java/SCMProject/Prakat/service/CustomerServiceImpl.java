package SCMProject.Prakat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import SCMProject.Prakat.dao.CustomerDao;
import SCMProject.Prakat.model.CustomerDim;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<CustomerDim> getAll() {
		
		return customerDao.getAll();
	}

	@Transactional
	@Override
	public void save(CustomerDim customerDim) {
		 customerDao.save(customerDim);
	}

}

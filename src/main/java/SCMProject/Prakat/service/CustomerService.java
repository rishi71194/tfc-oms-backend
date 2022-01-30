package SCMProject.Prakat.service;

import java.util.List;

import SCMProject.Prakat.model.CustomerDim;

public interface CustomerService {
	
	List<CustomerDim> getAll();
	void save(CustomerDim customerDim);
	CustomerDim getCustomerByID(Integer id);
}

package SCMProject.Prakat.dao;

import java.util.List;

import SCMProject.Prakat.model.CustomerDim;

public interface CustomerDao {
	
	List<CustomerDim> getAll();
	void save(CustomerDim customerDim);
	CustomerDim getCustomerById(Integer id);

}

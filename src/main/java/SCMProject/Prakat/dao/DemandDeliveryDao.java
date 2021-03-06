package SCMProject.Prakat.dao;

import java.util.List;

import SCMProject.Prakat.model.DemandDelivery;

public interface DemandDeliveryDao {

	List<DemandDelivery> getAll();
	List<DemandDelivery> getByDateID(int id);
	List<DemandDelivery> getByCustomerProduct(int customerId, int productId);
	List<DemandDelivery> getByDemandPerWeek(int year, int week, int cid, int pid);
}

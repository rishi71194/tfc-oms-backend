package SCMProject.Prakat.service;

import java.util.List;

import SCMProject.Prakat.model.DemandDelivery;

public interface DemandDeliveryService {

	List<DemandDelivery> getAll();
	List<DemandDelivery> getByDateID(int dateid1);
	List<DemandDelivery> getByCustomerProduct(int cid, int pid);
	List<DemandDelivery> getByCustomerProductWeek(int year, int week);
	List<DemandDelivery> getByDemandPerWeek(int year, int week, int cid, int pid);
}

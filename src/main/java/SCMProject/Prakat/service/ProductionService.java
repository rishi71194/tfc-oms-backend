package SCMProject.Prakat.service;

import java.util.List;

import SCMProject.Prakat.model.Production;

public interface ProductionService {

	List<Production> getAll();
	List<Production> getProductionByDateIDAndProductID(int dateID, int productID);
	List<Production> getProductionByDateID(int dateID, int productID);
	List<Production> getProductionByDateRange(int startdateid, int enddateid, int productID);
}

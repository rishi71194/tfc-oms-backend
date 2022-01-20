package SCMProject.Prakat.service;

import java.util.List;

import SCMProject.Prakat.model.ShelfLife;

public interface ShelfLifeService {

	List<ShelfLife> getAll();
	List<ShelfLife> getByShelfLifeAndCustomerID(int slife,int id);

}

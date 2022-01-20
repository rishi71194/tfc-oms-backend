package SCMProject.Prakat.dao;

import java.util.List;

import SCMProject.Prakat.model.ShelfLife;

public interface ShelfLifeDao {

	List<ShelfLife> getAll();
	List<ShelfLife> getByShelfLifeAndCustomerID(int slife,int id);
}

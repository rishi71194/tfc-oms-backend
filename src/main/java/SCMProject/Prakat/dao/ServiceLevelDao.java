package SCMProject.Prakat.dao;

import java.util.List;

import SCMProject.Prakat.model.ServiceLevel;

public interface ServiceLevelDao {

	List<ServiceLevel> getAll();
	List<ServiceLevel> getByServiceAndCustomerId(int level, int id);
	
}

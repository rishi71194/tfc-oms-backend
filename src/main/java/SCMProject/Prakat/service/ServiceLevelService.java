package SCMProject.Prakat.service;

import java.util.List;

import SCMProject.Prakat.model.ServiceLevel;

public interface ServiceLevelService {

	List<ServiceLevel> getAll();
	List<ServiceLevel> getByServiceAndCustomerId(int level, int id);
}

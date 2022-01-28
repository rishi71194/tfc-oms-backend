package SCMProject.Prakat.dao;

import java.util.List;

import SCMProject.Prakat.model.ServiceLevel;

public interface ServiceLevelDao {

	List<ServiceLevel> getAll();
	List<ServiceLevel> getByServiceAndCustomerId(int level, int id);
	String getServiceLevelByDate(String startDate, String endDate);
	String getServiceLevelByOrderLine(String startDate, String endDate, int pid, int cid);
}

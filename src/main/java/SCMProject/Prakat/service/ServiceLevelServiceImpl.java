package SCMProject.Prakat.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SCMProject.Prakat.dao.ServiceLevelDao;
import SCMProject.Prakat.model.ServiceLevel;

@Service
public class ServiceLevelServiceImpl implements ServiceLevelService{

	@Autowired
	private ServiceLevelDao serviceLevelDao;
	
	@Override
	public List<ServiceLevel> getAll() {
		return serviceLevelDao.getAll();
	}

	@Override
	public List<ServiceLevel> getByServiceAndCustomerId(int level, int id) {
		return serviceLevelDao.getByServiceAndCustomerId(level,id);
	}

	@Override
	public String getByDate(String startDate, String endDate) {
		return serviceLevelDao.getServiceLevelByDate(startDate, endDate);
	}

}

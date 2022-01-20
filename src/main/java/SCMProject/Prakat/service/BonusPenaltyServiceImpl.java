package SCMProject.Prakat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SCMProject.Prakat.dao.BonusPenaltyDao;
import SCMProject.Prakat.model.BonusPenalty;

@Service
public class BonusPenaltyServiceImpl implements BonusPenaltyService {
	
	@Autowired
	private BonusPenaltyDao bonusPenaltyDao;

	@Override
	public List<BonusPenalty> getAll() {

		return bonusPenaltyDao.getAll();
	}

}

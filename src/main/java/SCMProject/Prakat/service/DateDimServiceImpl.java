package SCMProject.Prakat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SCMProject.Prakat.dao.DateDimDao;
import SCMProject.Prakat.model.DateDim;

@Service
public class DateDimServiceImpl implements DateDimService {

	@Autowired
	private DateDimDao dateDimDao;
	
	
	@Override
	public List<DateDim> getAll() {

		return dateDimDao.getAll();
	}


	@Override
	public DateDim getByDate(String date) {

		return dateDimDao.getByDate(date);
	}

	@Override
	public int getNoOfDays(String startDate, String endDate) {
		return dateDimDao.getNumberOfDays(startDate, endDate);
	}

	@Override
	public List<DateDim> getByYearAndMonth(int year, int month) {

		return dateDimDao.getByYearAndMonth(year, month);
	}

	@Override
	public List<DateDim> getByYearAndWeek(int year, int week) {

		return dateDimDao.getByYearAndMonth(year, week);
	}




}

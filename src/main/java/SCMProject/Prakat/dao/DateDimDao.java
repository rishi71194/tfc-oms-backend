package SCMProject.Prakat.dao;

import java.util.List;

import SCMProject.Prakat.model.DateDim;

public interface DateDimDao {
	
	List<DateDim> getAll();

	DateDim getByDate(String date);
	int getNumberOfDays(String startDate, String endDate);
	List<DateDim> getByYearAndMonth(int year, int month);
	List<DateDim> getByYearAndWeek(int year, int week);
}

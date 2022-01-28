package SCMProject.Prakat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import SCMProject.Prakat.model.DateDim;

public interface DateDimService {

List<DateDim> getAll();
DateDim getByDate(String date);
int getNoOfDays(String startDate, String endDate);
List<DateDim> getByYearAndMonth(int year, int month);
List<DateDim> getByYearAndWeek(int year, int week);

}

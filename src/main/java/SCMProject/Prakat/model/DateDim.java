package SCMProject.Prakat.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="datedim")
public class DateDim {

	@Id
	@Column
	private int dateID;
	
	@Column(name="edate")
	private Date date;
	
	@Column(name="year_number")
	private String yearNumber;
	
	@Column(name="dquarter")
	private String quarter;
	
	@Column(name="month_number")
	private String monthNumber;
	
	
	@Column(name="month_name")
	private String monthName;
	
	@Column(name="week_number")
	private String weekNumber;
	
	@Column(name="week_day")
	private String weekDay;
	
	@Column(name="day_of_month")
	private String dayOfMonth;

	public int getDateID() {
		return dateID;
	}

	public void setDateID(int dateID) {
		this.dateID = dateID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getYearNumber() {
		return yearNumber;
	}

	public void setYearNumber(String yearNumber) {
		this.yearNumber = yearNumber;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public String getMonthNumber() {
		return monthNumber;
	}

	public void setMonthNumber(String monthNumber) {
		this.monthNumber = monthNumber;
	}

	public String getMonthName() {
		return monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	public String getWeekNumber() {
		return weekNumber;
	}

	public void setWeekNumber(String weekNumber) {
		this.weekNumber = weekNumber;
	}

	public String getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

	public String getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(String dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	@Override
	public String toString() {
		return "DateDim [dateID=" + dateID + ", date=" + date + ", yearNumber=" + yearNumber + ", quarter=" + quarter
				+ ", monthNumber=" + monthNumber + ", monthName=" + monthName + ", weekNumber=" + weekNumber
				+ ", weekDay=" + weekDay + ", dayOfMonth=" + dayOfMonth + "]";
	}
	
	
	
}

package datetimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTimeAPI {

	public static void main(String[] args) {
		
		LocalDate currdate = LocalDate.now();
		System.out.println("Current Date is : "+currdate);
		
		LocalDate date = LocalDate.of(2021, 8, 10);
		System.out.println("Date is : "+date);
		
		LocalDate yesterday = currdate.minusDays(1);
		System.out.println("Yesterday's date is : "+yesterday);
		
		LocalDate tomorrow = currdate.plusDays(1);
		System.out.println("Tomorrow's Date is : "+tomorrow);
		
	//	LocalDate tomorrows= currdate.plusDays(1);
		System.out.println("Current date is before tomorrows date : "+currdate.isBefore(tomorrow));
		
	//	LocalDate yesterdays = currdate.minusDays(1);
		System.out.println("Current date is after yesterdays date : "+currdate.isAfter(yesterday));
		
		LocalDate date1 = currdate.plus(5,ChronoUnit.MONTHS);
		System.out.println("Current date plus 5 months : "+date1);
		
		LocalDate date2 = currdate.minus(5, ChronoUnit.DAYS);
		System.out.println("Current Date minus 5 Days : "+date2);
		
		DayOfWeek dow = currdate.getDayOfWeek();
		System.out.println("Day of Week is : "+dow);
		
		int DayofMonth  = currdate.getDayOfMonth();
		System.out.println("Day of Month is : "+DayofMonth);
		
		int DayofYear = currdate.getDayOfYear();
		System.out.println("Day of Year is : "+DayofYear);
		
		
	//	LocalDate currdate = LocalDate.now();
		System.out.println(currdate + "is a leap ?"+ currdate.isLeapYear());
		System.out.println("Current Date :"+ currdate);
		System.out.println("Length of Month :"+ currdate.lengthOfMonth());
		System.out.println("Lenth of Year : "+ currdate.lengthOfYear());
		
	}

}

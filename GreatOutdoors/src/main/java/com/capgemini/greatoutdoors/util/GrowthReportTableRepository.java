package com.capgemini.greatoutdoors.util;

import java.util.*;

import com.capgemini.greatoutdoors.dto.WeeklyReport;

public class GrowthReportTableRepository {
	
    static Map<Date,WeeklyReport> obj=new HashMap<Date,WeeklyReport>();
	
	 static
	{
		obj.put(new Date(2020,01,07),new WeeklyReport(new Date(2020,01,07),1200.0) );
		obj.put(new Date(2020,01,14),new WeeklyReport(new Date(2020,01,14),1300.0) );
		obj.put(new Date(2020,01,21),new WeeklyReport(new Date(2020,01,21),1100.0) );
		obj.put(new Date(2020,01,28),new WeeklyReport(new Date(2020,01,28),100.0) );
		
		obj.put(new Date(2020,02,07),new WeeklyReport(new Date(2020,02,07),4000.0) );
		obj.put(new Date(2020,02,14),new WeeklyReport(new Date(2020,02,14),2050.0) );
		obj.put(new Date(2020,02,21),new WeeklyReport(new Date(2020,02,21),1800.0) );
		obj.put(new Date(2020,02,28),new WeeklyReport(new Date(2020,02,28),1000.0) );
		
		
		obj.put(new Date(2020,03,07),new WeeklyReport(new Date(2020,03,07),100.0) );
		obj.put(new Date(2020,03,14),new WeeklyReport(new Date(2020,03,14),100.0) );
		obj.put(new Date(2020,03,21),new WeeklyReport(new Date(2020,03,21),2000.0) );
		obj.put(new Date(2020,03,28),new WeeklyReport(new Date(2020,03,28),2400.0) );
		
		obj.put(new Date(2020,04,07),new WeeklyReport(new Date(2020,04,07),2.0) );
		obj.put(new Date(2020,04,14),new WeeklyReport(new Date(2020,04,14),21.0) );
		obj.put(new Date(2020,04,21),new WeeklyReport(new Date(2020,04,21),1.0) );
		obj.put(new Date(2020,04,28),new WeeklyReport(new Date(2020,04,28),11.0) );
		
		obj.put(new Date(2020,05,07),new WeeklyReport(new Date(2020,05,07),1200.0) );
		obj.put(new Date(2020,05,14),new WeeklyReport(new Date(2020,05,14),1300.0) );
		obj.put(new Date(2020,05,21),new WeeklyReport(new Date(2020,05,21),1100.0) );
		obj.put(new Date(2020,05,28),new WeeklyReport(new Date(2020,05,28),100.0) );
		
		obj.put(new Date(2020,06,07),new WeeklyReport(new Date(2020,06,07),4000.0) );
		obj.put(new Date(2020,06,14),new WeeklyReport(new Date(2020,06,14),2050.0) );
		obj.put(new Date(2020,06,21),new WeeklyReport(new Date(2020,06,21),1800.0) );
		obj.put(new Date(2020,06,28),new WeeklyReport(new Date(2020,06,28),1000.0) );
		
		
		obj.put(new Date(2020,07,07),new WeeklyReport(new Date(2020,07,07),100.0) );
		obj.put(new Date(2020,07,14),new WeeklyReport(new Date(2020,07,14),100.0) );
		obj.put(new Date(2020,07,21),new WeeklyReport(new Date(2020,07,21),2000.0) );
		obj.put(new Date(2020,07,28),new WeeklyReport(new Date(2020,07,28),2400.0) );
		
		obj.put(new Date(2020,8,07),new WeeklyReport(new Date(2020,8,07),2.0) );
		obj.put(new Date(2020,8,14),new WeeklyReport(new Date(2020,8,14),21.0) );
		obj.put(new Date(2020,8,21),new WeeklyReport(new Date(2020,8,21),1.0) );
		obj.put(new Date(2020,8,28),new WeeklyReport(new Date(2020,8,28),11.0) );
		
		obj.put(new Date(2020,9,07),new WeeklyReport(new Date(2020,9,07),1200.0) );
		obj.put(new Date(2020,9,14),new WeeklyReport(new Date(2020,9,14),1300.0) );
		obj.put(new Date(2020,9,21),new WeeklyReport(new Date(2020,9,21),1100.0) );
		obj.put(new Date(2020,9,28),new WeeklyReport(new Date(2020,9,28),100.0) );
		
		obj.put(new Date(2020,10,07),new WeeklyReport(new Date(2020,10,07),4000.0) );
		obj.put(new Date(2020,10,14),new WeeklyReport(new Date(2020,10,14),2050.0) );
		obj.put(new Date(2020,10,21),new WeeklyReport(new Date(2020,10,21),1800.0) );
		obj.put(new Date(2020,10,28),new WeeklyReport(new Date(2020,10,28),1000.0) );
		
		
		obj.put(new Date(2020,11,07),new WeeklyReport(new Date(2020,11,07),100.0) );
		obj.put(new Date(2020,11,14),new WeeklyReport(new Date(2020,11,14),100.0) );
		obj.put(new Date(2020,11,21),new WeeklyReport(new Date(2020,11,21),2000.0) );
		obj.put(new Date(2020,11,28),new WeeklyReport(new Date(2020,11,28),2400.0) );
		
		obj.put(new Date(2020,12,07),new WeeklyReport(new Date(2020,12,07),2.0) );
		obj.put(new Date(2020,12,14),new WeeklyReport(new Date(2020,12,14),21.0) );
		obj.put(new Date(2020,12,21),new WeeklyReport(new Date(2020,12,21),1.0) );
		obj.put(new Date(2020,12,28),new WeeklyReport(new Date(2020,12,28),11.0) );
	}
	
	public static Map<Date,WeeklyReport> getAllMonthsReport()
	{
		return obj;
	}
	
}

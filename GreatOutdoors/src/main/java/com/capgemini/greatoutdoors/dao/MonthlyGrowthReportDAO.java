package com.capgemini.greatoutdoors.dao;

import java.time.*;
import java.util.*;

import com.capgemini.greatoutdoors.dto.WeeklyReport;
import com.capgemini.greatoutdoors.util.GrowthReportTableRepository;

public class MonthlyGrowthReportDAO {
	
	
	public static Map<Date,WeeklyReport> getMonth(int month)
	{
		
		Map<Date,WeeklyReport> obj=GrowthReportTableRepository.getAllMonthsReport();
		
		Map<Date,WeeklyReport> output=new HashMap<Date, WeeklyReport>();
		
		for(Map.Entry<Date, WeeklyReport>me : obj.entrySet())
		{
			if(me.getKey().getMonth()==month)
			{
			 output.put(me.getKey(), me.getValue());
			}
		}
		return output;
	}
	
	public static double revenue(int month)
	{
		Map<Date,WeeklyReport> output=getMonth(month);
		double totalsaleformonth=0.0;
		
		for(Map.Entry<Date, WeeklyReport>me : output.entrySet())
		{
			totalsaleformonth+=me.getValue().getWeeklySale();
		}
		return totalsaleformonth;
	}
	
	public static double amountOfChange(int month,double totalsaleformonth)
	{
		
		Map<Date,WeeklyReport> output=getMonth(month);
		double totalsaleforpremonth=0.0;
	    
		for(Map.Entry<Date, WeeklyReport>me : output.entrySet())
		{
			totalsaleforpremonth+=me.getValue().getWeeklySale();
		}
		double d=-(totalsaleformonth-totalsaleforpremonth);
		System.out.println("Revenue Change as compare to previous month: "+d+"\n");
		return d;
	}
	
	public static double percentageGrowth(double totalsaleformonth,double totalSaleForPreviousMonth)
	{
		double change= (((totalsaleformonth-totalSaleForPreviousMonth)*100)/totalsaleformonth);
		return change;
	}
	
	public static String colourCode(double change)
	{
		if(change<2)
			return "Red  (Low)";
		else if(2<=change&&change<10)
			return "Blue  (Average)";
		else if(change>=10)
			return "Green  (High)";
		else
			return "";
	}
}
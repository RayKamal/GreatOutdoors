package com.capgemini.greatoutdoors.dto;

import java.util.Date;

public class WeeklyReport {

	private Date date;
	private double weeklySale;
	
	
	
	public WeeklyReport(Date date, double weeklySale) {
		super();
		this.date = date;
		this.weeklySale = weeklySale;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getWeeklySale() {
		return weeklySale;
	}
	public void setWeeklySale(double weeklySale) {
		this.weeklySale = weeklySale;
	}

 
}

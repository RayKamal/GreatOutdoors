package com.capgemini.greatoutdoors.dto;

public class GrowthReportTable {
	
	
	/*Date d1=new Date(2020/2/12);
	Date d2=new Date(2020/2/13);
	Date d3=new Date(2020/2/14);
	Date d4=new Date(2020/2/15);
	Date d5=new Date(2020/2/16);*/
	
	String period;
	double revenue, amountChange, percentageGrowth;
	String colrCode;
	
	
	public GrowthReportTable(String period, double revenue, double amountChange, double percentageGrowth,
			String colrCode) {
		super();
		this.period = period;
		this.revenue = revenue;
		this.amountChange = amountChange;
		this.percentageGrowth = percentageGrowth;
		this.colrCode = colrCode;
	}


	public String getPeriod() {
		return period;
	}


	public void setPeriod(String period) {
		this.period = period;
	}


	public double getRevenue() {
		return revenue;
	}


	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}


	public double getAmountChange() {
		return amountChange;
	}


	public void setAmountChange(double amountChange) {
		this.amountChange = amountChange;
	}


	public double getPercentageGrowth() {
		return percentageGrowth;
	}


	public void setPercentageGrowth(double percentageGrowth) {
		this.percentageGrowth = percentageGrowth;
	}


	public String getColrCode() {
		return colrCode;
	}


	public void setColrCode(String colrCode) {
		this.colrCode = colrCode;
	}
	
	
	
	
	
}

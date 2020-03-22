package com.capgemini.GrowthReportTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.greatoutdoors.dao.MonthlyGrowthReportDAO;


public class GrowthReportTestCases {
	
			
			@Test
			public void revenueTestCase1()
			{
				double str=3700.0;
				
				assertEquals((str),MonthlyGrowthReportDAO.revenue(1),0);
			}
		
			@Test
			public void revenueTestCase2()
			{
				double str2=8850.0;
				assertEquals(str2,MonthlyGrowthReportDAO.revenue(2),1);
			}
			
			@Test
			public void monthgrowthCase1()
			{
				double str=-5150.0;
				assertEquals(str,MonthlyGrowthReportDAO.amountOfChange(1, 8850.0),1);
			}

			@Test
			public void percentageChangeCase1()
			{
				double str=158.19209039548022-100;
				assertEquals(str,MonthlyGrowthReportDAO.percentageGrowth(8850.0,3700.0),1);
			}
		
			@Test
			public void percentageChangeCase2()
			{
				double str=7.608695652173913-100;
				assertEquals(str,MonthlyGrowthReportDAO.percentageGrowth(4600.0,8850.0),1);
			}
			
			@Test
			public void colourCodeTest() {
				String str ="Blue";
				assertEquals(str,MonthlyGrowthReportDAO.colourCode(7.608695652173913));
			}
			
			@Test
			public void colourCodeTest2()
			{
				String str="Green";
				assertEquals(str,MonthlyGrowthReportDAO.colourCode(158.19209039548022));
			}		
}

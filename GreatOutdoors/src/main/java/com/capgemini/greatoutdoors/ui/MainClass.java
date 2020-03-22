package com.capgemini.greatoutdoors.ui;

import java.util.Scanner;

import com.capgemini.greatoutdoors.exception.InvalidMonthException;
import com.capgemini.greatoutdoors.exception.InvalidRevenueSelection;
import com.capgemini.greatoutdoors.exception.UserDefinesException;
import com.capgemini.greatoutdoors.service.RevenueGrowthServiceClass;

public class MainClass {

	public static void main(String[] args) throws UserDefinesException, InvalidRevenueSelection,InvalidMonthException {
		// TODO Auto-generated method stub
		
		int index=0,getMonth = 0,choice=0,quaterChoice=0,choiceReport=0,deliveryReport=0;
		
		double sum=0,sum1=0,percentageChange=0,monthRevenue=0;
		
		String colour;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter 1 for growth report.... \nEnter 2 for revenue report....");
		choiceReport=obj.nextInt();
		if(choiceReport==1||choiceReport==2) {
		
		switch(choiceReport)
		{
		case 1:
		
			System.out.println("Enter month number in integer to calculate it's revenue");
			
			try
			{
			getMonth=obj.nextInt();
			if(1>getMonth&&getMonth>12)
				throw new InvalidMonthException();
			}
			catch(InvalidMonthException e)
			{
				System.out.println("Input month number from 1 to 12 only ");
			}
			
			
			sum=RevenueGrowthServiceClass.revenueFun(getMonth);
			System.out.println("Revenue of the given month: "+sum+"\n");
			
			if((getMonth-1)==0)
				getMonth=12;
			
			sum1=RevenueGrowthServiceClass.revenueFun(getMonth);

			
			
			sum1=RevenueGrowthServiceClass.amountChange(getMonth,sum1);
			
			
			percentageChange=RevenueGrowthServiceClass.perGrowth(sum,sum1);
			
			System.out.println("Percentage change: "+percentageChange);
			
			
			
			 colour=RevenueGrowthServiceClass.colCode(percentageChange);
			System.out.println("Color marker: "+colour);
			
			break;
			
		case 2:
			System.out.println("Revenue report.... ");
			
			System.out.println("Enter your choice\nEnter 1 for monthly report \nEnter 2 for quaterly report \nEnter 3 for yearly report\n");
			choice=obj.nextInt();
			if(choice==1 ||choice==2 ||choice==3) {
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter month no. in int to check monthly report");
				getMonth=obj.nextInt();
				
				sum=RevenueGrowthServiceClass.revenueFun(getMonth);
				System.out.println(sum+"\n");
				break;
				
			case 2:
				sum1=sum=0;getMonth=1;
				System.out.println("Enter your choice\n 1 for first quaterly report \n 2 for second quaterly report \n 3 for third quaterly report\n 4 for fourth quaterly report");
				
				quaterChoice=obj.nextInt();
				if(quaterChoice==1 ||quaterChoice==2 ||quaterChoice==3||quaterChoice==4) {
				switch(quaterChoice)
				{
				
				case 1:
					index=0;
				System.out.println("first quaterly revenue report \n");
				while(index<3)
				{
					sum=RevenueGrowthServiceClass.revenueFun(getMonth);
				sum1+=sum;
				
				getMonth++;
				index++;
				}
				System.out.println(sum1+"\n");
				break;
				
				case 2:
					index=3;
					System.out.println("second quaterly revenue report \n");
					while(index<6)
					{
						sum=RevenueGrowthServiceClass.revenueFun(getMonth);
					sum1+=sum;
					
					getMonth++;
					index++;
					}
					System.out.println(sum1+"\n");
					break;
					
				case 3:
					index=6;
					System.out.println("third quaterly revenue report \n");
					while(index<9)
					{
						sum=RevenueGrowthServiceClass.revenueFun(getMonth);
					sum1+=sum;
					
					getMonth++;
					index++;
					}
					System.out.println(sum1+"\n");
					break;
					
				case 4:
					index=9;
					System.out.println("fourth quaterly revenue report \n");
					while(index<12)
					{
						sum=RevenueGrowthServiceClass.revenueFun(getMonth);
					sum1+=sum;
					
					getMonth++;
					index++;
					}
					System.out.println(sum1+"\n");
					break;
			}}
				else throw new InvalidRevenueSelection();
			break;
			case 3:
				sum1=sum=0;getMonth=1;index=0;
				System.out.println("yearly revenue report \n");
				while(index<12)
				{
					sum=RevenueGrowthServiceClass.revenueFun(getMonth);
				sum1+=sum;
				
				getMonth++;
				index++;
				}
				System.out.println(sum1+"\n");
				break;
			}
		
		} 
			else
				throw new InvalidRevenueSelection();
		}}
		else
			throw new UserDefinesException("Invalid input");
		}		
}
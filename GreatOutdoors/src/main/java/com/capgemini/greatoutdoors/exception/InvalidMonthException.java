package com.capgemini.greatoutdoors.exception;

public class InvalidMonthException extends Exception {
	
	
	 public String toString()      {
	       return "InvalidMonthException["+"User must enter the month within 1 to 12"+"]";
	    }

}


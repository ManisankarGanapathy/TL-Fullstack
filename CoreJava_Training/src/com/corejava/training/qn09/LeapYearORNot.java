package com.corejava.training.qn09;

/*Calculate whether given year as leap or not; Sample input: int year = 2020; Sample output: boolean isLeapYear = true;*/
public class LeapYearORNot {

	public static void main(String[] args) {
		 int year = 2020;
		    boolean leap = false;
		    if (year % 4 == 0) {
		      if (year % 100 == 0) {
		        if (year % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }
		      else
		        leap = true;
		    }
		    
		    else
		      leap = false;

		    if (leap)
		      System.out.println(year + " is a leap year.");
		    else
		      System.out.println(year + " is not a leap year.");
		  }
	}

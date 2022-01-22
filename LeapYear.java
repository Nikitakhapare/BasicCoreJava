package com.BasicCoreProgram;


import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	int y;
	System.out.println("Enter the year");
	Scanner sc=new Scanner(System.in);
	y=sc.nextInt();
    if ((y%100==0) &&  (y%400==0))
         System.out.println("it is a leap year");
    else if ((y%4)==0)
         System.out.println("it is a leap year ");
    else
         System.out.println("it is not a leap year");

	}


	}

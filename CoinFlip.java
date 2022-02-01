package com.BasicCoreProgram;

import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) 
 {
		
	double n,i, counter1=0,counter2=0; 
        Scanner sc = new Scanner(System.in);
	 
	
        System.out.println("Enter a Number of time coin flip");
	n =sc.nextDouble();
	
	for(i=1;i<=n;i++)
	{
	//getting number between 0 to 1
             double rand= Math.random();
	     if(rand<0.5)
		{
		  System.out.println("Its Tail ");
	          counter1++;
		}
	    else
		{
		System.out.println("Its Head");
		counter2++;
		}
	}
	System.out.println("No of time tails appear "+counter1);
	System.out.println("No of time Head appear "+counter2);
	
	double percentage= (double)((counter2/n)*100);
	System.out.println("persentange of haid  is "+percentage);
	
	System.out.println("persentange of tail is "+(100-percentage));
 }
	
}

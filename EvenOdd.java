package com.BasicCoreProgram;

import java.util.Scanner;

public class EvenOdd {

	   public static void main(String[] args) 
        {
        
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Number= ");
	    int n=sc.nextInt();
	    
	    if(n%2==0)
	    
                 System.out.println("It is a Even Number");
	       
             else
	    	
                 System.out.println("It is a odd Number");

	   
	}
}

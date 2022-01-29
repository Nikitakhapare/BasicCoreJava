package com.BasicCoreProgram;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		System.out.println("Enter a three numbers= ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//using Ternary operator
		int big = a > b ? ( a > c ? a : c) : (b > c ? b : c) ;
		System.out.println(big);
		
		//using simple if-else-if statement 
		/*if(a>b && a>c)
		{
             System.out.println("Largest Number is="+a);
		}
		else if(b>a && b>c)
		{	
	         System.out.println("Largest Number is="+b);
		}
		else 
		{
	         System.out.println("Largest Number is="+c);

	    }*/
         
}
}

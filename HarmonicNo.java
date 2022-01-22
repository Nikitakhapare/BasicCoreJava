package com.BasicCoreProgram;

import java.util.Scanner;

public class Harmonic{
	public static void main(String[] args)
	{
		int n,i; float sum=0;
		System.out.println("enter any no." );
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

	  for(i=1; i<=n; i++)
     {
	 System.out.println("1/"+i);
	 sum=sum+(float) 1/i ;


      }
	  System.out.println("sum"+sum);

}
}
package com.BasicCoreProgram;

import java.util.Scanner;

public class SwapTwoNo {

	public static void main(String[] args) {
	    int c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a= ");
            int a=sc.nextInt();
            
        System.out.println("Enter b= ");
	        int b=sc.nextInt();
	        c=a;
	        a=b;
	        b=c;
	       
	    System.out.println("After Swapping a= "+a);
	    
	    System.out.println("After Swapping b= "+b);

	    

	}

}

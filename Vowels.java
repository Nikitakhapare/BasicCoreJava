package com.BasicCoreProgram;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		System.out.println("Enter a Alphabet: ");
		
		Scanner sc=new Scanner(System.in);
		char c = sc.next().charAt(0);   
		
		  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			  
                System.out.println("It is Vowel");
	      else
	    	  
	            System.out.println("It is Not Vowel");

			

	}

}

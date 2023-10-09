package com.Nagaraj.dsa;

import java.util.*;
public class SumOfNaturalNumber {
		
	public static int findSum(int n) 
	{
	 return n*(n+1)/2;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num:");
		int n = scan.nextInt();
		
	System.out.println(findSum(n));
		
	}

}

package com.Nagaraj.dsa;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a start:");
		int s = scan.nextInt();
		
		System.out.println("Enter a end:");
		int e = scan.nextInt();
		int f = 0;
		
		for(int i = s ; i<e;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f = 0;
					break;
				}
				else {
						f=1;
						
					 }
			}
			
		
		if(f==1)
		{
			System.out.println(i);
		}
	  }
	}
}

package com.Nagaraj.dsa;

import java.util.*;

public class EvenNumberFromArrays {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0 ;i<5;i++)
		{
			System.out.println("Enter a ele:");
			a.add(sc.nextInt());
		}
		System.out.println(a);
		ArrayList<Integer>  even_list = new ArrayList<>();
		for(int num :a)
		{
			if(num %2==0)
			{
				even_list.add(num);
			}	
		}
		System.out.println(even_list);
	}
}


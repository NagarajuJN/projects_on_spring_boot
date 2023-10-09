package com.Nagaraj.dsa;

import java.util.*;

public class Student {
	
	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Student s= new Student();
		
		ArrayList<Integer> arr = new ArrayList();
		
		for(int i = 0 ; i<5 ; i++)
		{
			System.out.print("Enter the marks");
			int ele=sc.nextInt();
			arr.add(ele);
		}
		System.out.println(arr);
		
		Collections.sort(arr);
		
		System.out.println(" Sorted array:"+arr);
		
		Collections.reverse(arr);
		
		System.out.println(" Sorted  array in desending in order:"+arr);

	}

}

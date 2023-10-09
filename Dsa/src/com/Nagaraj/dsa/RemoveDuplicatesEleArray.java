package com.Nagaraj.dsa;

import java.util.*;
public class RemoveDuplicatesEleArray {
	
	public static void main(String[] args) {
		
	int a[] = {10, 11,20,20, 30, 40, 50, 50, 10, 20};
	
	
	int n = a.length;
	
	
	HashSet<Integer> res= new HashSet<Integer>();
	
	for(int i = 0 ; i<n ;i++)
		{
				  
		res.add(a[i]);
		
		}
	System.out.println(res);
	
	
//	for(int i = 0 ; i<a.length-1;i++)
//		for(int j = i+1;j<a.length;j++)
//		{
//			if(a[i]==a[j])
//		{
//	
//			System.out.print(a[j]+" ");
//		}
////		else {}
////		System.out.println("Duplicates elements are "+a[i]);
//	}
//	
	
	
		
		
	}

}

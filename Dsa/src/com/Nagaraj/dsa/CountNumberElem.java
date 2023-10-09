package com.Nagaraj.dsa;

// Without using the length variable.
public class CountNumberElem {

	public static int count(int[] arr)
	{
		int i = 0,c = 0;
		
		while(arr[i]!='a')
		{
			c++;
			i++;
		}
	return c;
	}
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,45,6,3,4};
		
		System.out.println(count(a));
		
		
	}
}

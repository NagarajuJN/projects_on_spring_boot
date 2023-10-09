package com.Nagaraj.dsa;

public class OneDArrayList {
	
	public void display(int[] arr)
	{
		int n = arr.length;
		for(int i = 0 ; i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void arrayDemo()
	{
		int[] myArray =new int[5];
		display(myArray);
		
	}
	
	public static void main(String[] args) {
		
		OneDArrayList arr1D = new OneDArrayList();
		arr1D.arrayDemo();
		
	}

}

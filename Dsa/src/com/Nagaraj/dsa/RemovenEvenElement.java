package com.Nagaraj.dsa;

public class RemovenEvenElement {
	
	
	
	
	public static void oddEle(int[] arr) {
		
//		
		
		int oddCount = 0;
		for(int i = 0 ;i<arr.length-1;i++)
		{
			if(arr[i]%2 !=0)
			{
				System.out.print(arr[i]+" ");
				oddCount++;
			}
			
		}
		
		int[] res  = new int[oddCount];
		
		
	}

	public static void main(String[] args) {

		int a[] = {1,2,4,5,4,4,5};
		
		oddEle(a);
	}

}

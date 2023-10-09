package com.Nagaraj.dsa;

import java.util.*;

public class LargestNumberArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,22,3,4,44,5};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i:a)
		{
			list.add(i);
		}
		
		System.out.println(list);
		
		
		Collections.sort(list);
		
		System.out.println(list);
		
		LinkedHashSet<Integer> sorted_list = new LinkedHashSet<Integer>(list);
		
		System.out.println("without dupicates :"+sorted_list);
//		int max  = sorted_list.get(sorted_list.size()-1);
//		int sec_max  = sorted_list.size()-2;

		
		TreeSet<Integer> tset = new TreeSet<Integer>(sorted_list);
		System.out.println("First max:"+tset.last());
		
		tset.remove(tset.last());
		
		System.out.println("Second max:"+tset.last());


		
		
	}
}

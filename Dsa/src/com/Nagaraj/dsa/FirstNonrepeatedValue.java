package com.Nagaraj.dsa;

import java.util.Iterator;

public class FirstNonrepeatedValue {

	public static void main(String[] args) {
		
		boolean f =true;
		
		String s = "Nagaraj";
		for(char ch : s.toCharArray())
			{
				if(s.indexOf(ch)==s.lastIndexOf(ch))
				{
					System.out.println(" First Non repeated char is :"+ch);
					f = false;
					break;
				}
			}
		if(f==true)
			System.out.println("No non repeated char");
	}
}

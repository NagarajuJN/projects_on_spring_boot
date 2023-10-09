package com.Nagaraj.dsa;


import java.util.*;
public class PlaindromeString {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s  = sc.next();
		String res = "";
		
		for(char ch : s.toCharArray())
		{
			res = ch+res;	
		}
		System.out.println(res);
		
		if(res==s)
			System.out.println("true");
		else
			System.out.println("false");
	}
}

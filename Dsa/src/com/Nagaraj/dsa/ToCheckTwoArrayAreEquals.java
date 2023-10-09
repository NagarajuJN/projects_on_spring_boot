package com.Nagaraj.dsa;

import java.util.Arrays;

public class ToCheckTwoArrayAreEquals {

	
	public static void main(String[] args) {
		 int a [] = {1,2,3,4,5};
		 int b [] = {1,2,3,4,2,5};
		 
		 boolean toCheck = Arrays.equals(a, b);
		 System.out.println(toCheck);
	}
}

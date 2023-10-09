package com.Nagaraj.dsa;

import java.util.Scanner;

public class AreaOfTriangle {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base = sc.nextInt();
		int hight = sc.nextInt();
		
		int res = (base*hight)/2;
		
		System.out.println(res);
	}
}

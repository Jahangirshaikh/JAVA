package com.recursion;

public class Problem1 {
	
		public static void printNumbers(int n) {
			if(n==0) {//base condition
				return;
			}
			System.out.println(n);;//performing task
			printNumbers(n-1);//recursive call
		}
	
		//Print numbers from 5-1 using recursion
		public static void main(String[] args) {
			int n =5;
			printNumbers(5);
		}
}

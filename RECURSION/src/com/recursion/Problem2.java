package com.recursion;

public class Problem2 {
	
	public static void printSum(int n, int i, int sum) {
		if(i==n) { //base condition
			sum = sum+i;
			System.out.println(sum);
			return;
		}
		
		sum = sum + i;//task performing 
		printSum(n,i+1,sum); //recursive call
	}
	
	//print sum of first n natural numbers
	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		int sum = 0;
		printSum(5,i,sum);
	}
}

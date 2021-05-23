package com.test;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10;
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.println("FirstTerm "+firstTerm);
		System.out.println("Second term "+secondTerm);
		
		
		for (int i = 1; i < n-1; i++) {
			
			int nextTerm=firstTerm+secondTerm;
			    firstTerm=secondTerm;
			    secondTerm=nextTerm;
			    System.out.println(nextTerm);
			    

		}
		
		//System.out.println(nextTerm);
	}

}

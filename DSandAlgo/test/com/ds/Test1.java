package com.ds;
/*
 * 1. String reverse
 * 2. MergeSort
 * 3. QuickSort
 * 4. BinarySearch
 * 5. Tower of Hanoi
 * 6. Permutation.
 * 7. fibo series
 * 8. reverse an array.
 * 
 * 
 * 
 * */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("Find single digit sum "+singleDigit(9999999999999L));
		System.out.println("abcd "+rev("abcd"));
	}
	
	public static int fibo(int n){
		if(n==0 || n==1)
			return n;
		else
			return fibo(n-1) + fibo(n-2);
	}
	
	public static String rev(String s) {
		if(s.length() == 1)
			return s;
		else
			return s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
	}
	
	public static long singleDigit(long n) {
		if(n<10)
			return n;
		else {
			long rem = n%10;
			n = n/10;
			return singleDigit(rem+singleDigit(n));
		}
	}
}

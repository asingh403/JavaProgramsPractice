/**
 * Find the sum of the numbers in the given input string array Input {"2AA", "12", "ABC", "c1a"} 
 * Output:6 (2+1+2+1)
 */

package com.java.imp.prgms;

public class SumOfNums {

	public static void main(String[] args) {

//		String[] arr = { "delhi3", "12", "abb1gh", "java" };
		String[] arr = {"2AA", "12", "ABC", "c1a"}; // total count of digit in given array= 7
		
		SumOfNums sumOfNums = new SumOfNums();
		int result = sumOfNums.isStringDigitSum(arr);
		System.out.println(result);
	}
	
	private int isStringDigitSum(String[] string) {
		int sum = 0;

		StringBuilder sb = new StringBuilder();

		for (String s : string) {
			sb.append(s);
		}

		// Converting StringBuffer in String
		String str = sb.toString();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch) ) {
				int b = Integer.parseInt(String.valueOf(ch));
				sum += b;
			}
		}
		return sum;
	}

}

/**
 * LeetCode Id: 1342
 * Program Name : Number of Steps to Reduce a Number to Zero 
 */

package com.java.imp.prgms;

public class NumberOfStepsReduceToZero {

	public static void main(String[] args) {
		int n = 123;

		int output = numberOfSteps(n);
		System.out.println(output);

	}

	private static int numberOfSteps(int nums) {

		int res = 0;

		while (nums > 0) {
			if ((nums % 2) == 1)
				nums--;

			else {
				nums = nums / 2;
			}
			res++;
		}
		return res;

	}

}

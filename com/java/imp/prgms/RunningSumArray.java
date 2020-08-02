/**
 * LeedCode Problem ID: 1480
 */
package com.java.imp.prgms;

import java.util.Arrays;

public class RunningSumArray {

	public static void main(String[] args) {

		int[] array = { 3, 1, 2, 10, 1 };
		System.out.println("Input Array :"+"\n" + Arrays.toString(array));
		
		int [] output = runningSum(array);
		System.out.println("Output Array :"+"\n"+ Arrays.toString(output));
	}

	private static int[] runningSum(int[] input) {

		for (int i = 1; i < input.length; i++) {

			input[i] = input[i] + input[i - 1];
		}
		return input;

	}

}

/**
 * Shuffle the Array
 * LeetCode id : 1470
 */

package com.java.imp.prgms;

import java.util.Arrays;

public class ShuffleArray {

	public static int[] shuffle(int[] nums, int n) {

		int[] output = new int[2 * n];

		for (int i = 0; i < n; i++) {

			output[2 * i] = nums[i];
			output[2 * i + 1] = nums[n + i];

		}

		return output;

	}

	public static void main(String[] args) {

		int[] input = { 2, 5, 1, 3, 4, 7 };
		int n = 3;

		int[] result = shuffle(input, n);
		System.out.println(Arrays.toString(result));

	}

}

/**
 * Numbers of Good Pairs
 * LeetCode id : 1512	
 */
package com.java.imp.prgms;

public class GoodPairsNums {

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 1, 1, 3 };

		int[] arr = { 1, 2, 1, 2 };
		System.out.println(numIdenticalPairs(arr));
	}

	private static int numIdenticalPairs(int[] nums) {

		int res = 0;
		int[] len = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
//			res += len[nums[i]]++;
			
//			res = res + len[nums[i]]++;
			res = res + (len[nums[i]]++	);
		}
		return res;

	}

}

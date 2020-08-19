/**
* Sort Integers by The Number of 1 Bits
* LeetCode id: 1356
* 
* Explanation
* Given an integer array arr. You have to sort the integers in the array in 
* ascending order by the number of 1's in their binary representation and in 
* case of two or more integers have the same number of 1's you have to sort 
* them in ascending order.
*
* Example 1:
* 
* Input: arr = [0,1,2,3,4,5,6,7,8]
* Output: [0,1,2,4,8,3,5,6,7]
* Explantion: [0] is the only integer with 0 bits.
* [1,2,4,8] all have 1 bit.
* [3,5,6] have 2 bits.
* [7] has 3 bits.
* The sorted array by bits is [0,1,2,4,8,3,5,6,7]
**/

package com.java.imp.prgms;

import java.util.Arrays;

public class SortIntNumOneBits {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

		SortIntNumOneBits sortIntObj = new SortIntNumOneBits();

		int[] result = sortIntObj.sortByBits(arr);
		System.out.println(Arrays.toString(result));

	}

	public int[] sortByBits(int[] arr) {
		Pair[] pairs = new Pair[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int numSet = 0;
			int val = arr[i];

			while (val > 0) {
				numSet += val & 1;
				val >>= 1;
			}

			pairs[i] = new Pair(arr[i], numSet);
		}

		Arrays.sort(pairs);

		for (int i = 0; i < pairs.length; i++)
			arr[i] = pairs[i].val;

		return arr;
	}
}

class Pair implements Comparable<Pair> {
	int val;
	int numSet;

	public Pair(int v, int s) {
		val = v;
		numSet = s;
	}

	public int compareTo(Pair p) {
		if (this.numSet > p.numSet)
			return 1;
		else if (this.numSet < p.numSet)
			return -1;
		else {
			if (this.val > p.val)
				return 1;
			else if (this.val < p.val)
				return -1;
			else
				return 0;
		}
	}

}

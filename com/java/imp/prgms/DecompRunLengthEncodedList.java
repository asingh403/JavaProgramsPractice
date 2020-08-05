/**
* Decompress Run-Length Encoded List
* LeetCode id : 1313
*
* Example :
*
* Input: nums = [1,2,3,4]
* Output: [2,4,4,4]
* Explanation: 
* The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
* The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
* At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
**/

package com.java.imp.prgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompRunLengthEncodedList {

	public static int[] decompressRLElist(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < nums.length; i += 2) {
			int freq = nums[i - 1];
			while (freq > 0) {
				list.add(nums[i]);
				freq--;
			}
		}
		int[] arr = new int[list.size()];

		for (int i = 0; i < list.size(); i++)
			arr[i] = list.get(i);
		return arr;
	}

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		int [] output = decompressRLElist(nums);
		System.out.println(Arrays.toString(output));
		

	}

}

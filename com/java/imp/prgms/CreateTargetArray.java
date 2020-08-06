/**
* Create Target Array in the Given Order
* LeetCode id : 1389
* Example 1:
* 
* Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
* Output: [0,4,1,3,2]
* Explanation:
* nums       index     target
* 0            0        [0]
* 1            1        [0,1]
* 2            2        [0,1,2]
* 3            2        [0,1,3,2]
* 4            1        [0,4,1,3,2]
**/

package com.java.imp.prgms;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {

	public int[] createTargetArray(int[] nums, int[] index) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) 
		{
			list.add(index[i], nums[i]);
		}
		int output[] = new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			output[i] = list.get(i);
		}
		
		return output;
	}
	
	public static void main(String [] args) {
		int nums [] = { 0, 1, 2, 3, 4};
		int index [] = {0, 1, 2, 2, 1};
		
		CreateTargetArray target = new CreateTargetArray();
		
		int [] result = target.createTargetArray(nums, index);
		System.out.println(Arrays.toString(result));
		
		
		
		
	}

}

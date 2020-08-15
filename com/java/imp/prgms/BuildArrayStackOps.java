/**
* Build an Array With Stack Operations
* LeetCode id: 1441
* 
* Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
*
* Example 1:
* Input: target = [2,3,4], n = 4
* Output: ["Push","Pop","Push","Push","Push"]
**/

package com.java.imp.prgms;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayStackOps {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 4 };

		int goal = 4;

		BuildArrayStackOps basObj = new BuildArrayStackOps();

		List<String> result = basObj.buildArray(nums, goal);
		System.out.println(result);
	}

	public List<String> buildArray(int[] target, int n) {

		List<String> ops = new ArrayList<String>();

		int input = 1; // 1...n
		for (int i : target) {

			while (input < i) {
				ops.add("Push");
				ops.add("Pop");
				input++;
			}
			ops.add("Push");
			input++;
		}
		return ops;
	}
}

/**
* XOR Operation in an Array
* LeetCode id : 1486
* 
* EXAMPLE:
* 
* where nums[i] = start + 2*i (0-indexed) and n == nums.length
* 
* Input: n = 5, start = 0
* Output: 8
* Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
**/

package com.java.imp.prgms;

public class XORArray {

	public static int xorOperation(int n, int start) {
		int result = start;
		for (int i = 1; i < n; i++) {
			result = (result) ^ (start + (i << 1));
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 5;
		int start = 0;
		System.out.println(xorOperation(n, start));
	}
}

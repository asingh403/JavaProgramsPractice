/**
* Sort Array By Parity II
* LeetCode id: 922
* 
* Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
*
* Example 1:
* Input: [4,2,5,7]
* Output: [4,5,2,7]
* Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
**/
package com.java.imp.prgms;

import java.util.Arrays;

public class SortArrByParity {

	public static void main(String[] args) {
		
		SortArrByParity sortArrByParityObj = new SortArrByParity();
		int [] nums = {4, 2, 5, 7};
		
		
		System.out.println(Arrays.toString(sortArrByParityObj.sortArrayByParityII(nums)));
		
	}
	
	public int[] sortArrayByParityII(int [] A) {
		int i = 0;
		int j = 1;
		
		int n = A.length;
		
		while(i < n && j < n) {
			while(i < n && A[i]%2 == 0) {
				i +=2;
			}
			
			while(j < n && A[j]%2 == 1) {
				j +=2;
			}
			
			if(i < n && j < n) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		return A;
	} 
}

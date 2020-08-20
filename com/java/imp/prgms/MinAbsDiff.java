/**
* Minimum Absolute Difference
* LeetCode id: 1200
*
* Example 1:
* 
* Input: arr = [4,2,1,3]
* Output: [[1,2],[2,3],[3,4]]
* The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
**/

package com.java.imp.prgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsDiff {

	public static void main(String[] args) {
		int [] n = {4, 2, 1, 3};
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		MinAbsDiff madObj = new MinAbsDiff();
		
		result = madObj.minimumAbsDifference(n);
		
		System.out.println(result);	
	}

	public List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);

		List<List<Integer>> out = new ArrayList<List<Integer>>();

		int diff = Math.abs(arr[1] - arr[0]);

		for (int i = 0; i < arr.length - 1; i++) {
			int d = Math.abs(arr[i + 1] - arr[i]);

			if (d == diff) {
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(arr[i]);
				temp.add(arr[i + 1]);
				out.add(temp);
			} else if (d < diff) {
				diff = d;
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(arr[i]);
				temp.add(arr[i + 1]);
				out.clear();
				out.add(temp);
			}
		}
		return out;
	}

}

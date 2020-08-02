/**
 * Kids With the Greatest Number of Candies
 * LeetCode Id : 1431 
 */


package com.java.imp.prgms;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {

	public static void main(String[] args) {

		int [] input = { 2, 3, 5, 1, 3 };
		int n = 3;

		List<Boolean> result =  new ArrayList<Boolean>();
		result.addAll(kidsWithCandies(input, n));
		System.out.println(result);
		
		
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		int max = candies[0];

		for (int i = 0; i < candies.length; i++) {

			if (candies[i] > max) {
				max = candies[i];
			}
		}
		
		List<Boolean> output = new ArrayList<>();
		for(int j = 0; j < candies.length; j++) {
			if(candies[j]+extraCandies < max) {
				output.add(false);
			}else {
				output.add(true);
			}
		}
		return output;

	}
}

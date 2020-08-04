/**
 * How Many Numbers Are Smaller Than the Current Number
 * LeetCode id : 1365	
 */

package com.java.imp.prgms;

import java.util.Arrays;

public class SmallerNumThanCurrent {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        
    	int [] res = new int[nums.length];
    	
    	for(int i=0; i<nums.length; i++) {
    		int count = 0;
    		
    		int first = nums[i];
    		
    		for(int j=0; j<nums.length; j++) {
    			
    			if(first > nums[j]) {
    				count++;
    			}
    		}
    		res[i] = count;
    	}
    	return res;
    }

	public static void main(String[] args) {

		int[] n = { 8, 1, 2, 2, 3 };
		
		int [] ans = smallerNumbersThanCurrent(n);
		
            System.out.println(Arrays.toString(ans));
        
		
	}
}

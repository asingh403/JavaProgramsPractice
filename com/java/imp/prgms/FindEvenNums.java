/**
* Find Numbers with Even Number of Digits
* LeetCode id : 1295
* 
* Example:
* 
* Input: nums = [12,345,2,6,7896]
* Output: 2
* Explanation: 
* 345 contains 3 digits (odd number of digits). 
* 2 contains 1 digit (odd number of digits). 
* 6 contains 1 digit (odd number of digits). 
* 7896 contains 4 digits (even number of digits). 
* Therefore only 12 and 7896 contain an even number of digits. 
**/


package com.java.imp.prgms;

public class FindEvenNums {

    public static int findNumbers(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            int cnt = 0;
            while(nums[i] > 0){
                nums[i] = nums[i]/10;
                cnt++;
            }
            if(cnt % 2 == 0){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
		int[] n = { 12, 345, 2, 6, 7896 }; // 12 and 7896 having 2 and 4 digits in their nums
		System.out.println(findNumbers(n));
	}
}

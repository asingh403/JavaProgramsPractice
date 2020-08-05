/**
* Subtract the Product and Sum of Digits of an Integer
* LeetCode id : 1281
* 
* Example :
* Input: n = 234
* Output: 15 
* Explanation: 
* Product of digits = 2 * 3 * 4 = 24 
* Sum of digits = 2 + 3 + 4 = 9 
* Result = 24 - 9 = 15
**/

package com.java.imp.prgms;

public class SubProdAndSumDigit {

	public static void main(String[] args) {
		
		int nums  = 234;
		System.out.println(subtractProductAndSum(nums));
	}

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        
        while (n > 0){
            sum = sum + n % 10;
            product = product * n % 10;
            n = n/10;
        }
        return product-sum;
    }
}

/**
* Reverse String
* LeetCode id: 344
* 
* Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
*
* Constraint --
* Do not allocate extra space for another array, you must do this by modifying the input array
* in-place with O(1) extra memory.
**/

package com.java.imp.prgms;

public class ReverseStringArray {

	public static void main(String[] args) {
		
		char [] str = { 'h', 'e', 'l', 'l', 'o'};
		
		System.out.println(reverseString(str));
		}

	public static char [] reverseString(char[] s) {
		int i = 0, j = s.length - 1;

		while (i < j) {
			char temp = s[i];
			s[i++] = s[j];
			s[j--] = temp;
		}
		return s;
	}

}

/**
* Remove All Adjacent Duplicates In String
* LeetCode id: 1047
* 
* Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
*
* Example 1:
* Input: "abbaca"
* Output: "ca"
**/

package com.java.imp.prgms;

public class RmAdjDupStr {

	public static void main(String[] args) {
		String input = "abbaca";

		RmAdjDupStr removeDupObj = new RmAdjDupStr();
		String result = removeDupObj.removingDuplicates(input);
		
		System.out.println(result);
	}

	public String removingDuplicates(String S) {
		char[] stack = new char[S.length()];
		int i = 0;

		for (int j = 0; j < S.length(); j++) {
			char current_char = S.charAt(j);

			if (i > 0 && stack[i - 1] == current_char) {
				i--;
			} else {
				stack[i] = current_char;
				i += 1;
			}
		}
		return new String(stack, 0, 1);
	}
}

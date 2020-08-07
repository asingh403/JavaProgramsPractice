/**
* Split a String in Balanced Strings
* LeetCode id: 1221
* 
* Example 1:
* Input: s = "RLRRLLRLRL"
* Output: 4
* Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
* 
* Example 2:
* 
* Input: s = "LLLLRRRR"
* Output: 1
* Explanation: s can be split into "LLLLRRRR"
**/

package com.java.imp.prgms;

public class BalStrSplit {

	public static void main(String[] args) {
		String str = "RLRRLLRLRL";
		BalStrSplit o = new BalStrSplit();
		int result = o.balancedStringSplit(str);
		System.out.println(result);
	}

	public int balancedStringSplit(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int Balanced = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count += (s.charAt(i) == 'L') ? 1 : -1;
			if (count == 0)
				Balanced++;
		}
		return Balanced;
	}
}

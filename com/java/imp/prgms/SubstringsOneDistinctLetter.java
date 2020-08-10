package com.java.imp.prgms;
/**
* LeetCode Id : 1180
* Count Substrings with Only One Distinct Letter
* 
* Given a string S, return the number of substrings that have only one distinct letter.
* 
* Example 1:
* Input: S = “aaaba”
* Output: 8
* Explanation: The substrings with one distinct letter are “aaa”, “aa”, “a”, “b”.
* “aaa” occurs 1 time.
* “aa” occurs 2 times.
* “a” occurs 4 times.
* “b” occurs 1 time.
* So the answer is 1 + 2 + 4 + 1 = 8.
* 
* Example 2:
* 
* Input: S = “aaaaaaaaaa”
* Output: 55
**/

import java.util.HashMap;
import java.util.Map;

public class SubstringsOneDistinctLetter {

	public static void main(String[] args) {
		
		//String str = "aaaba"; // result  will be 8
		String str = "aaaaaaaaaa"; // result  will be 55 
		
		SubstringsOneDistinctLetter o = new SubstringsOneDistinctLetter();
		
		System.out.println(o.countLetters(str));
	}

	public int countLetters(String S) {
		int start = 0;
		int end = 0;
		Map<Character, Integer> map = new HashMap<>();
		int count = 0;
		int n = S.length();
		while (end < n) {
			char c = S.charAt(end);
			while (end < n && S.charAt(end) == c) {
				end++;
			}
			int temp = end - start;
			start = end;
			count += temp * (temp + 1) / 2;
		}
		return count;
	}
}

/**
* Find Common Characters
* Leet Code id : 1002
* 
* Example:
* 
* Input: ["bella","label","roller"]
* Output: ["e","l","l"]
**/

package com.java.imp.prgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChars {

	public static void main(String[] args) {
		//String[] str = { "bella", "label", "roller" };
		String[] str = { "aabd", "ab", "a" };

		CommonChars commonCharsObj = new CommonChars();
		List<String> result = commonCharsObj.commonChars(str);

		System.out.println(result);

	}

	public List<String> commonChars(String[] A) {

		List<String> result = new ArrayList<String>();
		if (A != null && A.length != 0) {
			int[] count = new int[26];
			int[] res = new int[26];
			Arrays.fill(count, Integer.MAX_VALUE);
			int i, j, l, N = A.length;

			for (i = 0; i < N; i++) {
				Arrays.fill(res, 0);
				l = A[i].length();
				for (j = 0; j < l; j++) {
					res[A[i].charAt(j) - 'a']++; // each char of each string read once
				}

				for (j = 0; j < 26; j++) {
					count[j] = Math.min(count[j], res[j]); // constant O(26) processing after each string
				}
			}

			for (i = 0; i < 26; i++) {
				while (count[i] != 0) {
					result.add(String.valueOf((char) ('a' + i)));
					--count[i];
				}
			}
		}
		return result;

	}
}

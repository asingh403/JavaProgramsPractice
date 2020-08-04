/**
 * LeetCode id: 771
 * Program Name : Jewels and Stones
 */

package com.java.imp.prgms;

import java.util.HashMap;
import java.util.Map;

public class JewelsStones {

	public static int numJewelsInStones(String J, String S) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		int sum = 0;
		for (char s : S.toCharArray()) {
			hm.put(s, hm.getOrDefault(s, 0) + 1);
		}
		for (char s : J.toCharArray()) {
			if (hm.containsKey(s)) {
				//sum += hm.get(s);
				sum = sum + hm.get(s);
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		String jewls = "aA";
		String Stones = "aAAbbbb";
		System.out.println(numJewelsInStones(jewls, Stones));

	}

}

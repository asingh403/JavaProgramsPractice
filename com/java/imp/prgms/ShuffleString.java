/**
 * LeetCode id: 771
 * Program Name : Shuffle String
 */

package com.java.imp.prgms;

public class ShuffleString {

	public static String restoreString(String s, int[] indices) {

		char[] res = new char[indices.length];

		for (int i = 0; i < indices.length; i++)
			res[indices[i]] = s.charAt(i);

		return new String(res);

	}

	public static void main(String[] args) {

		String str = "codeleet";
		int[] ind = { 4, 5, 6, 7, 0, 2, 1, 3 };
		
		System.out.println(restoreString(str, ind));

	}

}

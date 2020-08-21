/**
* String Compression
* LeetCode id: 443
*
* Example 1:
* 
* Input: arr = ["a","a","b","b","c","c","c"]
* Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
* 
* Explanation #01:
* "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
* 
*  
**/

package com.java.imp.prgms;

public class StringCompression {
	public static void main(String [] args){
		char [] str = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
		
		StringCompression strCompObj = new StringCompression();
		
		int result = strCompObj.compress(str);
		System.out.println(result);
		
	}
	
	public int  compress(char [] ch){
		
		int index = 0;
		int i = 0;
		
		while(i < ch.length){
			int j = i;
			while(j < ch.length && ch[j] == ch[i]){
				j++;
			}
			ch[index++] = ch[i];
			if((j-i) > 1){
				String count = (j-i) + "";
				for(char c: count.toCharArray()){
					ch[index++] = c;
				}
			}
			i = j;
		}
		return index;
	}
}

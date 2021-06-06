package com.corejava.training.qn02;

/*
Find the number of vowels in a given string
Input1:”NewyorkE” 'e' or 'E' - it should be counted as 1 Output1:2 Hint:irrespective of case
 */

public class VowelsCount {

	public static void main(String[] args) {
		String word = "NewyorkE";
		word = word.toUpperCase();
		char[] wordChar = word.toCharArray();
		int size = wordChar.length;
		int j = 0;
		for (int i = 0; i < size; i++) {
			if (wordChar[i] == 'A' || wordChar[i] == 'E' || wordChar[i] == 'I' || wordChar[i] == 'O'
					|| wordChar[i] == 'U') {
				j++;
			}
		}
		System.out.println("The vowels count is" + j);
	}
}

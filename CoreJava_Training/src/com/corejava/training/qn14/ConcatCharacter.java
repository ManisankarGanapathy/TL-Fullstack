package com.corejava.training.qn14;

import java.util.ArrayList;
/*
 * 14.Concatenate the character in a given position. If there is no character in a
 * given position place "$" sign. input1[]={"abc","da","ram"}; input2=3; hint :
 * 3rd character is "c" in "abc" 3rd character is not present in "da", so place
 * "$" 3rd character is "m" in "ram" concate all the characters to a single
 * string "c$m" o/p string ="c$m";
 */
public class ConcatCharacter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input1={"abc","da","ram"};
		int elementToBeConcated=3;
		ArrayList<Character> concat=new ArrayList<>();
		for (int i = 0; i < input1.length; i++) {
			if(input1[i].length()>=elementToBeConcated) {
				concat.add(input1[i].charAt(elementToBeConcated-1));
			}else {
				concat.add('$');
			}
		}
		for (Character character : concat) {
			System.out.print(character);
		}
	}

}

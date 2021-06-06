package com.corejava.training.qn04;

public class NumberOfWords {

	public static void main(String[] args) {
		String[] word = { "aa", "b", "cc", "ddd" };
		int input1 = 1, input2 = 2, input3 = 3;
		int one = 0, two = 0, three = 0;
		for (int i = 0; i < word.length; i++) {
			int length = word[i].toCharArray().length;
			if (length == input1)
				one++;
			else if (length == input2)
				two++;
			else if (length == input3)
				three++;
		}

		System.out.println("The size of one word is: " + one + "\nThe size of two word is: " + two
				+ "\nThe size of three word is: " + three);
	}

}

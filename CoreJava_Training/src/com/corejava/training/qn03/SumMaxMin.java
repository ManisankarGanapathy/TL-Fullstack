package com.corejava.training.qn03;

public class SumMaxMin {

	public static void main(String[] args) {
		int[] input = { 19, 12, 17 };
		int size = input.length;
		int min = input[0], max = 0;
		for (int i = 0; i < size; i++) {
			if (min > input[i])
				min = input[i];
			
			if (max < input[i])
				max = input[i];
		}
		System.out.println("Minimum value is: " + min);
		System.out.println("Maximum value is: " + max);
		System.out.println("The sum of min and maximum number in an array is:"+ (min+max));
	}
}

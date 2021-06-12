package com.corejava.training.qn05;
/*Find the sum of the numbers in the given input string array Input:{“2AA”,”12”,”ABC”,”c1a”) Output:6 (2+1+2+1) 
 * Note in the above array 12 must not considered as such it must be considered as 1,2
 */
 
public class SumOfNumberInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "2AA", "12", "ABC", "c1a" };
		System.out.println("The sum of the numbers in the array : "+sumOfNumbers(arr));
	}

	public static int sumOfNumbers(String[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (Character.isDigit(arr[i].charAt(j))) {
					counter+= Character.getNumericValue((arr[i].charAt(j)));
				}
			}
		}
		return counter;
	}

}

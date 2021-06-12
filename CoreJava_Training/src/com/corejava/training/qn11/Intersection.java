package com.corejava.training.qn11;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Intersection {
	/*
	 * 11.Find A interscetion B Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6};
	 * Sample output: int[] c={3,4}
	 */

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		System.out.print("intersection : ");
		printResult(intersection(a, b));
	}

	static ArrayList<Integer> intersection(int[] a, int[] b) {
		Set<Integer> intersection = new TreeSet<>();
		ArrayList<Integer> intersectionResults = new ArrayList<>();
		int[] mergedArray = mergeArray(a, b);
		for (int i = 0; i < mergedArray.length; i++) {
			for (int j = i + 1; j < mergedArray.length; j++) {
				if (mergedArray[i] == mergedArray[j]) {
					intersection.add(mergedArray[i]);
				}
			}
		}
		intersectionResults.addAll(intersection);
		return intersectionResults;
	}
	
	static int[] mergeArray(int[] a, int[] b) {
		int counter = 0;
		int[] union = new int[a.length + b.length];
		for (int i = 0; i < union.length; i++) {
			if (i < a.length) {
				union[i] = a[i];
			} else {
				union[i] = b[counter];
				counter++;
			}
		}
		return union;
	}
	
	static void printResult(ArrayList<Integer> result) {
		for (Integer integer : result) {
			System.out.print(integer + ", ");
		}
		System.out.println();
	}

}

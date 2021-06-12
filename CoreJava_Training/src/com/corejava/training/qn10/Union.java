package com.corejava.training.qn10;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Union {
	/*
	 * 10.Find A union B Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6}; Sample
	 * output: int[] c={1,2,3,4,5,6}
	 */

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		System.out.print("union : ");
		int[] union = mergeArray(a, b);
		Set<Integer> resultUnion = new TreeSet<>();
		for (int i = 0; i < union.length; i++) {
			resultUnion.add(union[i]);
		}
		ArrayList<Integer> listUnion = new ArrayList<>();
		listUnion.addAll(resultUnion);
		for (Integer integer : listUnion) {
			System.out.print(integer + ", ");
		}
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

}

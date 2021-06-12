package com.corejava.training.qn08;

/*
 * 8.Square root calculation ((x1+x2)(x1+x2))+((y1+y2)(y1+y2)) o/p should be
 * rounded of to int; Sample input: double x1=5; double x2=6; double y1=8;
 * double y2=3; output : 15
 */

public class SquareRootCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1,x2,y1,y2;
		int sqaureRoot;
		x1=5;
		x2=6;
		y1=8;
		y2=3;
		sqaureRoot=(int)((x1+x2)*(x1+x2))+(int)((y1+y2)*(y1+y2));
		System.out.println(sqaureRoot);
	}

}

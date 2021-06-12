package com.corejava.training.qn06;

/*
 * Convert String array to String String[] input1=["Vikas","Lokesh",Ashok] Expected output String: "Vikas,Lokesh,Ashok"
 */

public class CovertArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actualString="";
		String[] input1= {"Vikas","Lokesh","Ashok"};
		for (int i = 0; i < input1.length; i++) {
			actualString+= input1[i]+", ";
		}
		System.out.println(actualString);
	}

}

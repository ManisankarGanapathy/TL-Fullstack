package com.corejava.training.qn07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 7.Email Validation. Output is false if the validation fails else true. String
 * input1="test@gmail.com" 1)@ & : should be present; 2)@ & . should not be
 * repeated; 3)there should be four charcters between @ and .; 4)there shouls be
 * atleast 3 characters before @ ; 5)the end of mail id should be .com; Expected
 * Output=true
 */
public class EmailValidation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "testasdf@ased.com";
		Pattern email=Pattern.compile("^[a-z]{4,10}+@[a-z]{4}+\\.[com]{3}$");
		Matcher match=email.matcher(input1);
		boolean matches = match.matches();
		System.out.println(matches);
		
	}

}

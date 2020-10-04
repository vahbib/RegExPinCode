package com.day9.regex.pincode;

import java.util.*;
import java.util.regex.Pattern;

public class PinCode {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Pin Code.");
		String pincode = sc.nextLine();
		// UC1 PIN Code is a 6 digit code
		boolean pat1 = Pattern.matches("^[0-9]{6}$", pincode);
		// UC2 Restrict the PIN code from taking alphabets or special characters at the beginning.
		boolean pat2 = Pattern.matches("^[a-zA-z]{0,}[0-9]{6}$", pincode);
		// UC3 Restrict the PIN code from taking alphabets or special characters at the End.
		boolean pat3 = Pattern.matches("^[0-9]{6}[a-zA-z]{0,}$", pincode);
		// UC4 Make sure 400 088 is also valid along with 400088
		boolean pat4 = Pattern.matches("^[0-9]{3}\s{0,1}[0-9]{3}$",pincode);
		System.out.println("Entered Pin Code is " + pat1 + ".");
		System.out.println("Entered Pin Code is " + pat2 + ".");
		System.out.println("Entered Pin Code is " + pat3 + ".");
		System.out.println("Entered Pin Code is " + pat4 + ".");
		sc.close();
	}
}
package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String goofy = JOptionPane.showInputDialog("Whats your name ");

		// String i ;
		// 2. Print upper case name to the console using .toUpperCase()
		// Run your program to see that this works.
		System.out.println(goofy.toUpperCase());

		// 3. Loop through each character of the name (steps 4 - 6).
		// HINT: Use .length() to determine the number of characters in the String.
		for (int i = 0; i < goofy.length(); i++) {
			String u = goofy.substring(i, i + 1);
			System.out.println(u);
			if (i % 2 == 0) {
				u = u.toUpperCase();

			} else {
				u = u.toLowerCase();
			}
			goofyName += u;
		}
		JOptionPane.showMessageDialog(null,goofyName );
	}
	// 4. Create a String variable to store the next character of the name
	// using .substring(start, end)
	// HINT: replace 'start' and 'end' to get String with character at i

	// 5. Use MODULO to set this variable to upper case for EVEN characters
	// and lower case for ODD characters.

	// 6. ADD this String (containing 1 char) to the goofyName String

	// 7. Use pop-up to show user their Goofy name

}

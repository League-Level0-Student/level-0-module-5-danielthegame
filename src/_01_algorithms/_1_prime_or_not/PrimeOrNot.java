package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i = JOptionPane.showInputDialog("Pick a number");
		int prime = Integer.parseInt(i);
		for (int od = prime - 1; od > 1; od--) {
			if (prime % od == 0) {
				JOptionPane.showMessageDialog(null, "composit");
				
				System.exit(0);
			}
		}
		JOptionPane.showMessageDialog(null, "Prime");
	}
}

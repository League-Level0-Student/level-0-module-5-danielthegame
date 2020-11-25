package _02_nested_loops._3_for_loop_gauntlet;

public class Forloop {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}

		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}

		for (int i = 2; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		for (int i = 1; i < 501; i++) {
			
			if (i % 2 == 1) {
				System.out.println( i +" is odd");
			}
			if (i % 2 == 0) {
				System.out.println( i + " is even");

			}
		}
		for (int i = 7; i < 778; i++) {
			if(i%7==0) {
				 System.out.println(i);
			}
			
		      
			}
		for (int j = 2009; j < 2021; j++) {
			System.out.println(j+ " i was " + ( j- 2009 ) + " Years old" ); 
	}
}}

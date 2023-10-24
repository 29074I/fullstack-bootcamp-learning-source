package 이중for문;

public class Ex05별찍기 {

	public static void main(String[] args) {

		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 5; i >= 1; i--) {
			// j -> 5 4 3 2 1 
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

package 이중for문;

public class Ex06별찍기 {

	public static void main(String[] args) {

		// ----*
		// ---**
		// --***
		// -****
		// *****

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

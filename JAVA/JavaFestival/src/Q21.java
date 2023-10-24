
public class Q21 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int a = 0;
		int b = 0;

		int min = Math.abs(point[0] - point[1]);

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (i != j) {
					if (min > Math.abs(point[i] - point[j])) {
						min = Math.abs(point[i] - point[j]);
						a = i;
						b = j;
					}
				}
			}

		}
		System.out.printf("result = [%d, %d]", a, b);

	}
}

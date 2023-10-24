package 이중for문;

public class Ex02이중for문 {

	public static void main(String[] args) {
		// 2 ~ 30까지의 약수

		for (int i = 2; i < 31; i++) {
			System.out.printf("%d의 약수 : ", i);
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.printf("%d ",j);
				}
			}
			System.out.println();
		}

	}

}

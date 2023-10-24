
public class Q6 {

	public static void main(String[] args) {
		// (77*1)+(76*2)+(75*3)+...+(1*77)를 계산하여 결과를 출력
		// 결과 : 79079

		long sum = 0;

		// i는 77부터 1까지 1씩 감소
		// i와 78-i를 곱하여 합계에 더함
		for (int i = 77; i >= 1; i--) {
			sum += i * (78 - i);
		}
		System.out.println(sum);

	}

}

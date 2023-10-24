import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 n 입력 : ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		int num = 1;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = num++;
			}
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%d\t",arr[j][i]);
			}
			System.out.println();
		}
	}

}

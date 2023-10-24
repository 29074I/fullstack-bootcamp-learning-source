import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 n 입력 >> ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		int num = 1;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(i%2==0) {
					arr[i][j]=num++;
				}else {
					arr[i][4-j]=num++;
				}
			}

		}
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}

	}

}

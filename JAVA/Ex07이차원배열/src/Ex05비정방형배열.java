import java.util.Scanner;

public class Ex05비정방형배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[4];
		int[][] arr = new int[4][];
		
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[4];
		arr[3] = new int[6];

		
		for(int i=0; i<arr.length;i++) {
			System.out.printf("%d반 점수입력\n",i+1);
			for(int j=0; j<arr[i].length;j++) {
				System.out.printf("%d반 %d번째 학생 점수 >> ",i+1,j+1);
				arr[i][j] = sc.nextInt();

			}

		}
		for(int i=0; i<arr.length;i++) {
			int sum = 0;
			double avg=0;
			System.out.printf("%d반 >> ",i+1);
			for(int j=0;j<arr[i].length;j++) {
			System.out.printf("%d ",arr[i][j]);
			sum += arr[i][j];
			avg = sum/(float)arr.length; // 평균계산

			}
			System.out.printf("\n총점 : %d 평균 : %f\n",sum,(double)avg);

		}


			}
	}


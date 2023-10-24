import java.util.Random;

public class Q10 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] arr = new int[8];
		
		System.out.print("배열에 있는 모든 값 : ");
		for(int i=0; i<arr.length;i++) {
			arr[i]=rd.nextInt(60)+1;
			System.out.printf("%d ",arr[i]);
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf("\n가장 큰 값 : %d\n가장 작은 값 : %d",max,min);
	}

}

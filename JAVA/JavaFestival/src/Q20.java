import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		System.out.print("숫자입력>>");
		int n = sc.nextInt();
		
		int i=0;
		while(n>=2) {
			arr[i]=n%2;
			n/=2;
			i++;
		}
		arr[i]=n;
		for(int j=i;j>=0;j--) {
		System.out.printf("%d ",arr[j]);
		}
	}

}

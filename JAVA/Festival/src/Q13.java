
public class Q13 {

	public static void main(String[] args) {
		
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		String[] arr = score.split(",");

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		for( int i=0; i<arr.length;i++) {
			if(arr[i].equals("A")) {
				a++;
			}else if(arr[i].equals("B")) {
				b++;
			}else if(arr[i].equals("C")){
				c++;
			}else if (arr[i].equals("D")) {
				d++;
			}else {
				f++;
			}
		}
		
		System.out.printf("A : %d명\nB : %d명\nC : %d명\nD : %d명\nF : %d명",a,b,c,d,f);
	}

}

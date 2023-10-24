package 탐색;

public class Ex01순차검색 {

	public static void main(String[] args) {

		int[] arr = {13,35,15,11,26,72,78,13,61,90};
		
		int num = 78;	// 찾고 싶은 숫자
		
		// 순차검색 : 0~ 배열 끝 하나하나 비교해서 찾는 방법
		//        : 정렬되어 있을 필요가 없음 !
		// 78은 6번 인덱스에 있습니다. 출력
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {	// 찾은 경우
				System.out.printf("%d은 %d번 인덱스에 있습니다!",num,i);
				break;	// 값이 중복되지 않는 경우에만! 뒤쪽은 보지 않도록!
			}
		}
		
	}

}

package 큐;

public class intQueue {
	// 필드
	private int[] que;		// 큐용 배열
	private int capacity;	// 큐의 용량
	private int front;		// 맨 앞의 요소 커서
	private int rear;		// 맨 뒤의 요소 커서
	private int num;		// 현재 데이터 개수
	
	// 생성자
	public intQueue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
		que = new int[capacity];
		} catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	// 인큐(데이터 삽입)
	public int enque(int x) {
		que[rear++]=x;
		num++;
		if(rear==capacity)
			rear = 0;
		return x;
	}
	// 디큐(데이터 삭제)
	public int deque() {
		int x=que[front++];
		num--;
		if(front==capacity)
			front=0;
		return x;
	}
	
	// peek : 맨 앞(첫번째)에 데이터 확인
	public int peek() {
		return que[front];
	}
	// clear : 큐 비우기
	public void clear() {
		num=front=rear=0;
	}
	// indexOf : 특정값의 배열 상 인덱스 확인
	public int indexOf(int x) {
		for(int i=0;i<num;i++) {
			int idx = (i+front)%capacity;
			if(que[idx]==x)		// 검색 성공
				return idx;
		}
		return -1;				// 검색 실패
	}
	// size : 쌓여있는 데이터 개수
	public int size() {
		return num;
	}
	// isEmpty : 큐가 비어있는지 확인
	public boolean isEmpty() {
		return num <=0;
	}
	// isFull : 큐가 가득차있는지 확인
	public boolean isFull() {
		return num >= capacity;
	}
	// dump : 큐 안에 데이터를 front ~ rear 순서로 출력
	public void dump() {
		if(num<=0) {
			System.out.println("큐가 비어 있습니다.");
		}else {
			for(int i=0;i<num;i++) {
				System.out.printf("%d ",que[(i+front)%capacity]);
			}
			System.out.println();
		}
	}
}

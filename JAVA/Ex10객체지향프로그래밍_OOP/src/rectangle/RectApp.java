package rectangle;

import java.util.Scanner;

public class RectApp {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		System.out.printf("사각형의 면적은 %d",rect.getArea());

	}

}

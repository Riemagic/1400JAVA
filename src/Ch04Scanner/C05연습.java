package Ch04Scanner;

import java.util.Scanner;

public class C05연습 {

	public static void main(String[] args) {
//		이름을 입력하세요 : 홍길동
//		홍길동 님의 나이를 입력하세요 : 34
//		홍길동 님의 주소를 입력하세요 : 대구광역시 달서구 무슨무슨동
//		[PROFILE]
//		이름 : 홍길동
//		나이 : 34
//		주소 : 대구광역시 달서구 무슨무슨동
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.printf("%s 님의 나이를 입력하세요 : ", name);
		int age = sc.nextInt();
		sc.nextLine();
		System.out.printf("%s 님의 주소를 입력하세요 : ", name);
		String adress = sc.nextLine();
		System.out.println();
		System.out.println("[PROFILE]");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + adress);
		
		sc.close();

	}

}

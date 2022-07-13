package Ch04Scanner;

import java.util.Scanner;

public class C99문제용 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		[필수 정보 입력]
//		1. 이름 : ______________ENTER
//		2. 주민번호 6자리 : ______________ENTER
//		3. 전화번호 : ____________ENTER
//
//		[입력한 내용]
//		이름 : 홍길동
//		주민번호 : 123456
//		PH : 010-222-3333
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름 : ");
		String name = sc.next();
		System.out.print("2. 주민번호 6자리 : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("3. 전화번호 : ");
		String tel = sc.next();
		
		System.out.println();
		System.out.println("[입력한 내용]");
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + number);
		System.out.println("PH : " + tel);
		
		sc.close();

	}

}

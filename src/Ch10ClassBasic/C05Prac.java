package Ch10ClassBasic;

import java.util.Scanner;

public class C05Prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String 클래스로 문자열을 하나 입력받습니다
		// 1 입력받은 문자열의 길이 출력
		// 2 문자열의 idx중에 2,3,4 만 출력
		// 3 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 포함되어 있는지 확인
		// 4 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 일치하는지 여부 확인
		// 5 저장된 문자열의 길이를 확인해서, 특정 문자열 위치 idx 확인 후 확인된 idx 위치에서 마지막 idx까지 잘라내기
		
		System.out.print("문자열 입력 : ");
		String st = sc.next();
		System.out.println("--------[1번]--------");
		System.out.println("문자열의 길이 : " + st.length());
		
		System.out.println("--------[2번]--------");
		System.out.println("idx 2번 : " + st.charAt(2));
		System.out.println("idx 3번 : " + st.charAt(3));
		System.out.println("idx 4번 : " + st.charAt(4));
		
		System.out.println("--------[3번]--------");
		System.out.print("찾을 문자열 입력 : ");
		String st2 = sc.next();
		System.out.println("해당 문자열의 포함여부 : " + st.contains(st2));
		
		System.out.println("--------[4번]--------");
		System.out.println("해당 문자열과 일치여부 : " + st.equals(st2));
		
		System.out.println("--------[5번]--------");
		System.out.print("idx 확인할 문자 입력 : ");
		String st3 = sc.next();
		System.out.printf("입력하신 %s의 idx는 %d입니다\n", st3, st.indexOf(st3));
		System.out.print("출력 시작할 idx 위치 입력 : ");
		int n = sc.nextInt();
		System.out.printf("%d번째부터 마지막까지 출력문자는 %s 입니다", n, st.substring(n, st.length()));
		
		sc.close();

	}

}

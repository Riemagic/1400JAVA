package Ch07While;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//기본
		//1 탈출용 변수 지정
		//2 탈출용 조건식
		//3 조건식이 false가 되도록 하는 연산식
		
//		int i = 1;		//1 탈출용 변수
//		while(i <= 10)	//2 탈출용 조건식
//		{
//			System.out.printf("i=%d Hello world!\n", i);
//			i++;	//3 조건식이 false가 되기 위한 연산식
//		}
		
		
		
		//02 1부터 10까지 합 구하기
//		int i = 1;
//		int sum = 0;	//누적합 저장용
//		while(i<=10)
//		{
//			System.out.println("i="+i);
//			sum += i;	//증가되는 i값을 기존의 sum과 합하여 누적
//			i++;
//		}
//		System.out.println("while 벗어남 i="+i);
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		
		//문제
		//정수값 하나(n)을 입력받아
		//1부터 n까지의 합을 구합니다
//		System.out.print("정수 입력 : ");
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i <= n)
//		{
//			sum += i;
//			i++;
//		}
//		System.out.printf("1부터 %d까지의 합 : %d\n", n, sum);
		
		
		//문제
		//정수값 두개(n,m)을 입력받아
		//n부터 m까지의 합을 구합니다
//		System.out.print("정수1 입력 : ");
//		int n = sc.nextInt();
//		System.out.print("정수2 입력 : ");
//		int m = sc.nextInt();
//		
//		int temp = 0;
//		if(n > m)
//		{
//			temp = n;
//			n 	 = m;
//			m 	 = temp;
//		}
//		
//		int sum = 0;
//		int i = n;
//		while(i <= m)
//		{
//			sum += i;
//			i++;
//		}
//		System.out.println(n + "부터 " + m + "까지의 합 : " + sum);
		
		
		
		//2단 구구단
//		int i = 1;
//		while(i <= 9)
//		{
//			System.out.printf("2 x %d = %d\n", i, 2*i);
//			i++;
//		}	
		
		
		//2단 역순
//		int i = 9;
//		while(i >= 1)
//		{
//			System.out.printf("2 x %d = %d\n", i, 2*i);
//			i--;
//		}
		
		
		//n단 역순
		//정수값 하나 받아서
//		System.out.print("입력할 구구단 : ");
//		int n = sc.nextInt();
//		
//		int i = 9;
//		while(i >= 1)
//		{
//			System.out.printf("%d x %d = %d\n", n, i, n*i);
//			i--;
//		}
		
		
		//1부터 n까지 수 중에
		//3의 배수의 합만 구하세요
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i <= n)
		{
			if(i % 3 == 0)
			{
				System.out.println("i : " + i);
				sum += i;
			}
			i++;
		}
		System.out.printf("1부터 %d까지 3의 배수의 합 : %d\n", n, sum);
		
		
		sc.close();
	
	}

}

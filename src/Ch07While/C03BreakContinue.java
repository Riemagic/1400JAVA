package Ch07While;

import java.util.Scanner;

public class C03BreakContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//close
		
		//-1을 입력하기 전까지는 무한대로 값을 입력받아
		//입력된 값의 합을 출력
		
//		int sum = 0;	//누적용
//		int data = 0;	//값받기
//		while(true)
//		{
//			System.out.print("숫자 입력(-1 입력시 종료) : ");
//			data = sc.nextInt();
//			if(data == -1)
//			{
//				System.out.println("프로그램을 종료합니다");
//				break;	//가장 근접한 while문을 벗어남
//			}
//			sum += data;
//		}
//		System.out.println("입력된 값들의 합 " + sum);
		
		
		
		//continue
		
		//1부터 10까지의 수 중의 3의 배수는 제외한 합을 출력
//		int i = 1;
//		int sum = 0;
//		while(i <= 10)
//		{
//			if(i % 3 == 0)
//			{
//				i++;
//				continue;	//가까이에 있는 반복문의 조건식으로 돌아감(아래쪽 코드로 안감)
//			}
//			System.out.println("i : " + i);
//			sum += i;
//			i++;
//		}
//		System.out.println("합 : " + sum);
		
		
		
		//문제
		//1부터 n까지의 수 중에서 4의 배수는 제외한 수의 합과 평균을 출력
		
		System.out.print("정수 입력 : ");
		int i = 1;
		int n = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		
		while(i <= n)
		{
			if(i % 4 == 0)
			{
				i++;
				continue;
			}
			System.out.println("i = " + i);
			sum += i;
			i++;
			cnt++;
		}
		double avg = (double)sum / cnt;
		System.out.printf("%d 까지의 합 : %d\n", n, sum);
		System.out.printf("평균 : %.2f\n", avg);
	
		sc.close();

	}

}

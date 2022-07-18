package Ch08For;

import java.util.Scanner;

public class C01For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int i = 1;
//		while(i <= 10)
//		{
//			System.out.println("i : " + i);
//			i++;
//		}
		
//		for(int i = 1; i <= 10; i++)
//		{
//			System.out.println("i : " + i);
//		}
		
		//1부터 n까지의 합
//		System.out.print("정수 입력 : ");
//		int n = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= n; i++)
//		{
//			sum += i;
//		}
//		System.out.printf("1부터 %d까지의 합 : %d", n, sum);
		
		
		
		//n부터 m까지의 합
//		int i;
//		System.out.print("정수1 입력 : ");
//		int n = sc.nextInt();
//		System.out.print("정수2 입력 : ");
//		int m = sc.nextInt();
//		int sum = 0;
//		if(n >= m)
//		{
//			for(i = m; i <= n; i++)
//			{
//				sum += i;
//			}
//			System.out.printf("%d부터 %d까지의 합 : %d\n", m, n, sum);
//		}
//		else
//		{
//			for(i = n; i <= m; i++)
//			{
//				sum += i;
//			}
//			System.out.printf("%d부터 %d까지의 합 : %d\n", n, m, sum);
//		}
		
		
		
		//n부터 m까지의 수 중에 3의배수를 제외한 합
//		int i;
//		System.out.print("정수1 입력 : ");
//		int n = sc.nextInt();
//		System.out.print("정수2 입력 : ");
//		int m = sc.nextInt();
//		int sum = 0;
//		if(n >= m)
//		{
//			for(i = m; i <= n; i++)
//			{
//				if(i % 3 == 0)
//				{
//					continue;
//				}
//				sum += i;
//			}
//			System.out.printf("%d부터 %d까지의 합(3의배수 제외) : %d\n", m, n, sum);
//		}
//		else
//		{
//			for(i = n; i <= m; i++)
//			{
//				if(i % 3 == 0)
//				{
//					continue;
//				}
//				sum += i;
//			}
//			System.out.printf("%d부터 %d까지의 합(3의배수 제외) : %d\n", n, m, sum);		
//		}
		
		//구구단 출력
//		int i;
//		System.out.print("출력할 단을 입력하세요 : ");
//		int dan = sc.nextInt();
//		System.out.printf("[ %d 단 출력]\n", dan);
//		for(i = 1; i < 10; i++)
//		{
//			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//		}
		
		
		
		//----------중첩for----------
		//전체 구구단 출력
//		int i;
//		int dan;
//		for(dan = 2; dan <= 9; dan++)
//		{
//			System.out.printf("[ %d 단]\n", dan);
//			for(i = 1; i <= 9; i++)
//			{
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//			}
//			System.out.println();
//		}
		
		
		
		//전체 구구단 역순 출력
//		int i;
//		int dan;
//		for(dan = 9; dan >= 2; dan--)
//		{
//			System.out.printf("[ %d 단]\n", dan);
//			for(i = 9; i >= 1; i--)
//			{
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//			}
//			System.out.println();
//		}
		
		
		
		//별찍기(직삼각형,역직각삼각형,정삼각형,역정삼각형...)
		//직삼각형
//		System.out.print("높이 입력 : ");
//		int n = sc.nextInt();
//		int i;
//		int j;
//		for(i = 0; i < n; i++)
//		{
//			for(j = 0; j <= i; j++)
//			{
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		
		
		//역직삼각형
//		System.out.print("높이 입력 : ");
//		int n = sc.nextInt();
//		int i;
//		int j;
//		for(i = 0; i <= n; i++)
//		{
//			for(j = n; j > i; j--)
//			{
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		
		
		
		//정삼각형
		//   *
		//  ***
		// *****
		//*******
//		System.out.print("높이 입력 : ");
//		int n = sc.nextInt();
//		int i;
//		int j;
//		int k;
//		for(i = 0; i < n; i++)
//		{
//			for(j = 0; j < n - i - 1; j++)
//			{
//				System.out.print(' ');
//			}
//			for(k = 0; k < 2 * i + 1; k++)
//			{
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		
		
		
		//역정삼각형
		//*******
		// *****
		//  ***
		//   *
//		System.out.print("높이 입력 : ");
//		int n = sc.nextInt();
//		int i;
//		int j;
//		int k;
//		for(i = 0; i < n; i++)
//		{
//			for(j = 0; j < i; j++)
//			{
//				System.out.print(' ');
//			}
//			for(k = 0; k < 2 * n - 1 - 2 * i ; k++)
//			{
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		

	}

}

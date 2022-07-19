package Ch07While;

//import java.util.Scanner;

public class C02WhileWhile {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		//전체 구구단 출력(2-9단)
//		int dan = 2;
//		int i;
//		while(dan <= 9)
//		{
//			System.out.printf("[ %d 단 ]\n", dan);
//			i = 1;
//			while(i <= 9)
//			{
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
	
		// 문제
		// 2에서 올라가는 역순 구구단 출력
//		int dan = 2;
//		int i;
//		
//		while(dan <= 9)
//		{
//			System.out.printf("[ %d 단 ]\n", dan);
//			i = 9;
//			while(i >= 1)
//			{
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		// 문제
		// 9에서 내려가는 역순 구구단 출력
//		int dan = 9;
//		int i;
//		
//		while(dan >= 2)
//		{
//			System.out.printf("[ %d 단 ]\n", dan);
//			i = 9;
//			while(i >= 1)
//			{
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		//별찍기
		//*****
		//*****
		//*****
		//*****
//		int a = 0;	//줄바꿈
//		int b = 0;	//별
//		while(a < 4)
//		{
//			b = 1;
//			while(b <= 5)
//			{
//				System.out.print('*');
//				b++;
//			}
//			System.out.println();
//			a++;
//		}
//		System.out.println();
		
		
		//*
		//**
		//***
		//****
//		i(행)	j(열)
//		i=0		j=0
//		i++		j++
//		i<4		j<=i
		
//		int i = 0;
//		int j = 0;
//		while(i < 4)
//		{
//			j = 0;
//			while(j <= i)
//			{
//				System.out.print('*');
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		System.out.println();
		
		
		
		//****
		//***
		//**
		//*
//		i(행)	j(열)
//		i=4		j=0
//		i++;	j++;
//		i<4		j<=
//		int i2 = 0;
//		int j2 = 0;
//		while(i2 < 4)
//		{
//			j2 = 0;
//			while(3-i2 >= j2)
//			{
//				System.out.print('*');
//				j2++;
//			}
//			System.out.println();
//			i2++;
//		}
//		System.out.println();
		
		
		
		//   *
		//  ***
		// *****
		//*******
//		i(행)		j(공백)		k(별)
//		0			0-2			0-0
//		1			0-1			0-2
//		2			0-0			0-4
//		3			x			0-6
//		i = 0		j = 0		k = 0
//		i++;		j++;		k++;
//		i < 4		j <= 2-i	k <= 2*i
		
//		int i = 0;	//행증가
//		int j = 0;	//공백
//		int k = 0;	//별
//		while(i < 4)
//		{
//			//공백찍기
//			j = 0;
//			while(j <= 2-i)
//			{
//				System.out.print(' ');
//				j++;
//			}
//			
//			//별찍기
//			k = 0;
//			while(k <= 2*i)
//			{
//				System.out.print('*');
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//*******
		// *****
		//  ***
		//   *
//		i(행)	j(공백)		k(별)
//		0		x			0-6
//		1		0-0			0-4
//		2		0-1			0-2
//		3		0-2			0-0
//		i = 0	j = 0		k = 0
//		i++;	j++;		k++;
//		i < 4	j <= i-1	k <= 6 - 2i
		
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		while(i < 4)
//		{
//			j = 0;
//			while(j <= i-1)
//			{
//				System.out.print(' ');
//				j++;
//			}
//			
//			k = 0;
//			while(k <= 6 - 2*i)
//			{
//				System.out.print('*');
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//문제
		//다이아몬드모양 출력
		//모래시계모양 출력
		//높이 입력받아 출력하는 직각 삼각형
		//높이 입력받아 출력하는 직각 역삼각형
		//높이 입력받아 출력하는 정삼각형
		//높이 입력받아 출력하는 역삼각형
		//높이 입력받아 출력하는 다이아몬드
		//높이 입력받아 출력하는 모래시계
	
		
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******
		
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		//다이아몬드모양 출력
//		i(행)		j(공백)		k(별)
//		0			0-2			0-0
//		1			0-1			0-2
//		2			0-0			0-4
//		3			x			0-6
//		-----------------------------
//					j=0			k=0
//					j++			k++
//					j<=			k<=
//		
//		4			0-0			0-4
//		5			0-1			0-2
//		6			0-2			0-0
//		-----------------------------
//					j=0			k=0
//					j++			k++
//					j<=			k<+
		
		int i = 0;
		int j = 0;
		int k = 0;
		while(i <= 6)
		{
			if(i<=3)
			{
				j = 0;
				while(j <= 2 - i)
				{
					System.out.print(' ');
					j++;
				}
				
				k = 0;
				while(k <= 2 * i)
				{
					System.out.print('*');
					k++;
				}
			}
			else
			{
				j = 0;
				while(j <= i - 4)
				{
					System.out.print(' ');
					j++;
				}
				
				k = 0;
				while(k <= 12 - 2 * i)
				{
					System.out.print('*');
					k++;
				}
			}
			System.out.println();
			i++;
		}
		
		
		//높이 입력받아 출력하는 정삼각형
//		System.out.print("높이 입력 : ");
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		int k = 0;
//
//		while(i < n)
//		{
//			j = 0;
//			while(j <= n - i - 2)
//			{
//				System.out.print(' ');
//				j++;
//			}
//			
//			k = 0;
//			while(k <= 2*i)
//			{
//				System.out.print('*');
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//높이 입력받아 출력하는 역삼각형
//		System.out.print("높이 입력 : ");
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		int k = 0;
//
//		while(i < n)
//		{
//			j = 0;
//			while(j <= i - 1)
//			{
//				System.out.print(' ');
//				j++;
//			}
//			
//			k = 0;
//			while(k <= 2*n - 2*(i+1))
//			{
//				System.out.print('*');
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
	}
}


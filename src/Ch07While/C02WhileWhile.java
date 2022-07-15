package Ch07While;

public class C02WhileWhile {

	public static void main(String[] args) {
		
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
		int c = 1;
		int d;
		int cnt1 = 0;
		while(c > 0)
		{
			d = 4;
			d -= cnt1;
			while(d > 0)
			{
				System.out.print('*');
				d--;
			}
			System.out.println();
			c--;
			cnt1++;
		}
		
		//****
		//***
		//**
		//*
		
		//   *
		//  ***
		// *****
		//*******
		
		
		
	}

}

package Ch11Array;

import java.util.Scanner;

public class C04Array {

	public static void main(String[] args) {

		//1 행, 열의 크기를 키보드로 받습니다
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 입력 : ");
		int a = sc.nextInt();
		System.out.print("열의 크기 입력 : ");
		int b = sc.nextInt();
		int [][] arr = new int [a][b];
		
		
		//2 행, 열 안에 각각의 위치에 값을 입력합니다
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("arr[%d][%d] 값 입력 : ", i, j);
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		//3 각 행의 값의 총합을 따로 출력
		int [] a_sum = new int [arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				a_sum[i] += arr[i][j];
			}
			System.out.printf("%d 행의 총합 : %d\n", i, a_sum[i]);
		}
		
		
		//4 각 열의 값의 총합을 따로 출력
		int [] b_sum = new int [arr[0].length];
		for(int j = 0; j < arr[0].length; j++)
		{
			for(int i = 0; i < arr.length; i++)
			{
				b_sum[j] += arr[i][j];
			}
			System.out.printf("%d 열의 총합 : %d\n", j, b_sum[j]);
		}
		
		
		//5 모든 값의 총합을 따로 출력합니다
		int total = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
				{
					total += arr[i][j];
				}
		}
		System.out.println("\n모든 값의 총합 : " + total);
		
		
		
		sc.close();
	}

}

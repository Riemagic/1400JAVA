package Ch11Array;

import java.util.Scanner;

public class C02Array {

	public static void main(String[] args) {
		//문제
//		Scanner sc = new Scanner(System.in);
//		
//		//1 배열의 크기를 입력받습니다
//		System.out.print("배열의 크기 입력 : ");
//		int size = sc.nextInt();
//		int arr[] = new int[size];
//	
//		
//		//2 크기만큼 점수를 키보드로 부터 입력받아 배열에 차례대로 저장합니다
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.print("arr[" + i + "] = ");
//			arr[i] = sc.nextInt();
//		}
//		int max = arr[0];
//		int min = arr[0];
//		int sum = 0;
//
//		
//		//3 배열에 저장된 각 요소에 접근하여 전체 합과 평균을 출력
//		for(int i : arr)
//		{
//			sum+=i;	//누적
//		}
//		double avg = (double)sum / arr.length;
//		System.out.println("전체 합 : " + sum);
//		System.out.printf("전체 평균 : %.2f\n", avg);
//		
//		
//		//4 배열안의 저장된 점수 중에 가장 큰 값과 가장 작은 값을 출력
//		for(int i = 1; i < arr.length; i++)
//		{
//			if(max < arr[i])
//			{
//				max = arr[i];
//			}
//			
//			if(min > arr[i])
//			{
//				min = arr[i];
//			}
//		}
//		System.out.println("가장 큰 값 : " + max);
//		System.out.println("가장 작은 값 : " + min);
//		
//		sc.close();
		
		
		
		//문제
		int arr[] = {10, 30, 20, 15, 4};
		sort(arr);	//정렬 함수
		for(int i : arr)	//정렬된 결과 출력
		{
			System.out.print(i + " ");
		}
		
		

	}
	public static void sort(int[] arr)
	{
		//배열을 정렬합니다
		//선택/삽입/버블/기수/병합/퀵.. 아무거나 정렬 로직 사용
		//선택 정렬 사용(왼쪽요소부터 차례대로 정렬되는 방식)
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
	}

}

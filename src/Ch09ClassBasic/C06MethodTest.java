package Ch09ClassBasic;

import java.util.Scanner;

class SumCal
{
	Scanner sc = new Scanner(System.in);
	//인자 o, 반환 o
	int sum1(int x, int y)
	{
		return x + y;
	}
	
	//인자 o , 반환 x
	void sum2(int x, int y)
	{
		System.out.printf("void sum2(x, y) = %d\n", (x+y));
	}
	
	//인자 x , 반환 o
	int sum3()
	{
		System.out.print("첫번째 정수 입력 : ");
		int x = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int y = sc.nextInt();
		return x + y;
	}
	
	//인자 x , 반환 x
	void sum4()
	{
		System.out.print("첫번째 정수 입력 : ");
		int x = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int y = sc.nextInt();
		sc.close();
		System.out.println("void sum4(x, y) = " + (x+y));
	}
}


public class C06MethodTest {

	public static void main(String[] args) {
		//객체 생성
		SumCal obj1 = new SumCal();
		
		//함수호출
		int result = obj1.sum1(10, 20);
		System.out.printf("sum1(10, 20) = %d\n", result);
		
		obj1.sum2(30, 40);
		
		int result3 = obj1.sum3();
		System.out.println("sum3() = " + result3);
		
		obj1.sum4();
	}

}

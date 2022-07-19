package Ch09ClassBasic;

import java.util.Scanner;

public class C02Car {
	Scanner sc = new Scanner(System.in);
	//속성
	public String owner;
	public int speed;
	public int fuel;
	
	//기능
	void input()
	{
		System.out.print("차주명 입력 : ");
		owner = sc.next();
		System.out.print("속도 입력 : ");
		speed = sc.nextInt();
		System.out.print("연료 입력 : ");
		fuel = sc.nextInt();
	}
	void Accel()
	{
		System.out.println(owner + "님의 차량 속도가 증가합니다");
	}
	
	void Break()
	{
		System.out.println(owner + "님의 차량 속도가 감소합니다");
	}
	
	void ShowInfo()
	{
		System.out.printf("차주 : %s\n속도 : %d\n기름 : %d\n", owner, speed, fuel);
	}
	
}

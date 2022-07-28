package Ch16AbstractMain;

import java.util.Scanner;

//문제
//Converter 클래스를 상속받아 Km를 mile(마일)로 변환하는 Km2Mile 클래스를 작성하라, 
abstract class Converter1
{
	abstract protected double convert(double src); 
	protected double KtM;
	public void run()
	{
		System.out.println("Km 을 mile로 바꿉니다");
		System.out.print("Km을 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		double result = convert(km);
		System.out.println("변환 결과 : " + result + "mile 입니다");
		sc.close();
	}
}

class Km2Mile extends Converter1
{
	double m;
	Km2Mile(double m)
	{
		KtM = m;
	}
	
	protected double convert(double src)
	{
		return src / KtM;
	}

}

public class C04Main {

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
		toMile.run();
//		
//		Km을 mile로 바꿉니다.
//		Km을 입력하세요>> 30
//		변환 결과: 18.75mile입니다

	}

}

package Ch17Interface;

interface Tire
{
	void run();
}

class kumhoTire implements Tire
{
	@Override
	public void run()
	{
		System.out.println("금호타이어가 굴러갑니다");
	}
}

class hankook implements Tire
{
	@Override
	public void run()
	{
		System.out.println("한국타이어가 굴러갑니다");
	}
}

class Car
{
	Tire FR;
	Tire FL;
	Tire BR;
	Tire BL;
	Car()
	{
		FR = new kumhoTire();
		FL = new kumhoTire();
		BR = new kumhoTire();
		BL = new kumhoTire();
	}
	
	void CarStart()
	{
		FR.run();
		FL.run();
		BR.run();
		BL.run();
	}
}

public class C02InterfaceMain {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.CarStart();
		
		mycar.FL = new hankook();
		mycar.BR = new hankook();
		System.out.println("--------");
		mycar.CarStart();
	}

}

package Ch14Inheritance;

//is A = 이다
//노트북-하위 is A 컴퓨터-상위(O)
//컴퓨터-상위 is A 노트북-하위(X)

class Test
{
	Test()
	{
		System.out.println("TEST생성자 호출!");
	}
}

class Point2D extends Test	//상위클래스(부모,슈퍼)
{
	public int x;
	public int y;
	
	Point2D()
	{
		System.out.println("Point2D생성자 호출!");
	}
	
	public void ShowXY()
	{
		System.out.println("X : " + x + "\nY : " + y);
	}
}

class Point3D extends Point2D //Point2D를 상위클래스로 하는 Point3D클래스(하위/서브/자식)
{
	public int z;	//추가
	
	Point3D()
	{
		System.out.println("Point3D생성자 호출!");
	}
	
	public void ShowXYZ()
	{
		ShowXY();
		System.out.println("Z : " + z);
	}
}

public class C01상속Main {

	public static void main(String[] args) {
		Point3D ob = new Point3D();
		ob.x = 10;
		ob.y = 20;
		ob.z = 30;	//하위클래스 확장된 멤버
		ob.ShowXY();
		ob.ShowXYZ();	//하위클래스 확장된 멤버

	}

}

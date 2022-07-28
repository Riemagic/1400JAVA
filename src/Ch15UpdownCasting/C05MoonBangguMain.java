package Ch15UpdownCasting;

class MoonBanggu
{
	static int scount = 100;	//샤프 재고량
	static int pcount = 100;	//연필 재고량
	
	//함수 정의
	protected void Write()
	{
		
	}
}

class sharp extends MoonBanggu
{
	sharp()
	{
		super.scount--;		//샤프객체 생성시 재고량 감소 
	}
	
	protected void Write()
	{
		System.out.println("샤프로 씁니다");
	}
}

class pencil extends MoonBanggu
{
	pencil()
	{
		super.pcount--;		//연필객체 생성시 재고량 감소
	}
	
	protected void Write()
	{
		System.out.println("연필로 씁니다");
	}
}

public class C05MoonBangguMain {
	
	public static MoonBanggu ReqMoonBanggu(String thing)
	{
		if(thing.equals("샤프"))
		{
			return new sharp();
		}
		
		else if(thing.equals("연필"))
		{
			return new pencil();
		}
		
		else
		{
			return null;
		}
	}
	
	public static void ShowInfo()
	{
		System.out.println("샤프 재고량 : " + MoonBanggu.scount);
		System.out.println("연필 재고량 : " + MoonBanggu.pcount);
	}

	public static void main(String[] args) {
		sharp ob1 = (sharp)ReqMoonBanggu("샤프");		// sharp ob1 = 상위클래스 참조변수
		sharp ob2 = (sharp)ReqMoonBanggu("샤프");
		pencil ob3 = (pencil)ReqMoonBanggu("연필");
		ob1.Write();
		ShowInfo();

	}
}

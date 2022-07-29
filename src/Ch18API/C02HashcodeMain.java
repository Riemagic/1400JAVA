package Ch18API;

class C02Simple
{
	@Override
	public int hashCode()
	{
		System.out.println("해쉬코드 함수 호출");
		return 4;
	}
}

public class C02HashcodeMain {

	public static void main(String[] args) {
		
		C02Simple ob = new C02Simple();
		
		System.out.println(ob.toString());
//		System.out.printf("%x\n", ob.hashCode());
	}

}

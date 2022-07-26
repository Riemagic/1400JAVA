package Ch14Inheritance;

class TV
{
	private int size;	//필드, 속성
	
	public TV(int size)	//생성자
	{
		this.size = size;
	}
	
	protected int getSize()	//Getter 함수
	{
		return size;
	}
}

class ColorTV extends TV
{
	int color;
	public ColorTV(int size, int color)
	{
		super(size);
		this.color = color;
	}
	
	public void printProperty()
	{
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
}

class IPTV extends ColorTV
{
	String IP;
	public IPTV(String IP, int size, int color)
	{
		super(size, color);
		this.IP = IP;
	}
	
	public void printProperty()
	{
		System.out.println("나의 IPTV는 " + IP + " 주소의 " + getSize() + "인치 " + color + "컬러");
	}
}

public class C05상속Prac {

	public static void main(String[] args) {
		//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		//-> 32인치 1024컬러
		
		//[2번] 다음 main() 메소드와 실행 결과를 참고하여 ColorTV를 상속받는 IPTV 클래스를 작성하라
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);	//"192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();
		//->나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
	}

}

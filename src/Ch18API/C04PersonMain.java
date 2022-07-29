package Ch18API;

class Person
{
	private String name;	//이름
	private String id;		//주민등록번호
	private String addr;	//주소
	
	//생성자는 Main 함수 보면서 만들기
	Person(String name, String id, String addr)
	{
		this.name = name;
		this.id = id;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	//equals() 재정의 id와 addr가 일치하면 true / 불일치시 false
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Person)
		{
			Person down = (Person)obj;
			return this.id.equals(down.id) && this.addr.equals(down.addr);
		}
		return false;
	}

	//toString() 재정의 name과 addr만 리턴
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + "]";
	}

}

public class C04PersonMain {

	public static void main(String[] args) {
		Person hong1 = new Person("홍길동", "888888-8888888", "대구");
		Person hong2 = new Person("홍길동", "888888-8888888", "대구");
		Person kim = new Person("김상중", "123456-1234567", "울산");
		System.out.println(hong1);
		System.out.println(hong1.equals(hong2));
		System.out.println(hong1.equals(kim));

	}

}

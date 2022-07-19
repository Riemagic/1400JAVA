package Ch09ClassBasic;

class C04Person
{
	//속성(멤버변수)
	String name;
	int age;
	float height;
	double weight;
	
	//기능(멤버메서드,멤버함수)
	void talk()
	{
		System.out.println(name + "님이 말합니다");
	}
	void walk()
	{
		System.out.println(name + "님이 걷습니다");
	}
	void showinfo()
	{
		System.out.printf("이름:%s\n나이:%d\n키:%.1f\n몸무게:%.1f\n", name, age, height, weight);
	}
}

public class C04PersonMain {

	public static void main(String[] args) {
		C04Person hong = new C04Person();
		//속성에 데이터 저장
		hong.name = "홍길동";
		hong.age = 55;
		hong.height = 177.6f;
		hong.weight = 66.6;
		
		//기능 사용
		hong.talk();
		hong.walk();
		hong.showinfo();

	}

}

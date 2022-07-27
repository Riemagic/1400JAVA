package Ch15UpdownCasting;

class Person{
	String name;
}

class Employee extends Person{
	String dept;

}

class PartTimer extends Employee{
	int hourlyPay;

	@Override
	public String toString() {
		return "PartTimer [hourlyPay=" + hourlyPay + ", dept=" + dept + ", name=" + name + "]";
	}
}

class Regular extends Employee{
	int salary;

	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", dept=" + dept + ", name=" + name + "]";
	}
}

public class C02UpcastingMain {
	
	public static void ShowInfo(Person person)	//상속관계의 상위 클래스
												//하위객체를 연결할 수 있는 매개변수
												//Person person = ob1; //업캐스팅
	{											//Person person = ob2; //업캐스팅
//		System.out.println("이름 : " + person.name);	//Person클래스에서 물려준 멤버(접근 o)
//		System.out.println("부서 : " + person.dept);	//Employee클래스에서 물려준 멤버(접근 x)
		
		
		if(person instanceof PartTimer)
		{
			//파트타이머로 다운 캐스팅
			PartTimer downP = (PartTimer)person;
			System.out.println(downP.toString());
		}
		
		else if(person instanceof Regular)
		{
			//정규직으로 다운캐스팅
			Regular downR = (Regular)person;
			System.out.println(downR.toString());
		}
		
	}

	public static void main(String[] args) {
		
		PartTimer ob1 = new PartTimer();
		ob1.name = "홍길동"; ob1.dept="인사부"; ob1.hourlyPay = 20000;
		ShowInfo(ob1);
		
		System.out.println();
		
		Regular ob2 = new Regular();
		ob2.name = "김상중"; ob2.dept="총무부"; ob2.salary = 4000;
		ShowInfo(ob2);
		
	}

}

package Ch14Inheritance;

class Employee
{
	String name;
	int age;
	int worktime;
	
	Employee()
	{
		System.out.println("Employee 디폴트 생성자");
	}

	Employee(String name, int age, int worktime)
	{
		this.name = name;
		this.age = age;
		this.worktime = worktime;
	}
}

class PartTimer extends Employee
{
	int hourlywage;
	int contract;
	PartTimer()
	{
		super();
		System.out.println("PartTimer 디폴트 생성자");
	}
	
	PartTimer(String name, int age, int worktime, int h, int c)
	{
		super(name, age, worktime);
		hourlywage = h;
		contract = c;
	}

	@Override
	public String toString() {
		return "PartTimer [hourlywage=" + hourlywage + ", contract=" + contract + ", name=" + name + ", age=" + age
				+ ", worktime=" + worktime + "]";
	}
}

class Regular extends Employee
{
	int salary;
	String rank;
	Regular()
	{
		super();
		System.out.println("Regular 디폴트 생성자");
	}
	
	Regular(String name, int age, int worktime, int s, String r)
	{
		super(name, age, worktime);
		salary = s;
		rank = r;
	}

	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", rank=" + rank + ", name=" + name + ", age=" + age + ", worktime="
				+ worktime + "]";
	}
}

public class C03상속Main {

	public static void main(String[] args) {
		
		PartTimer hong = new PartTimer("홍길동", 55, 4, 20000, 90);
									//이름, 나이, 근무시간, 시급, 계약일수
		Regular kim = new Regular("김상중", 44, 8, 3800, "대리");
									//이름, 나이, 근무시간, 연봉, 직책
		System.out.println(hong.toString());
		System.out.println(kim.toString());
	}

}

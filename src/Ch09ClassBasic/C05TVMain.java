package Ch09ClassBasic;

import java.util.Scanner;

class TV
{
	Scanner sc = new Scanner(System.in);
	//속성
	String corporation;
	int year;
	int inch;
	
	//기능
	void input()
	{
		System.out.print("회사 입력 : ");
		corporation = sc.next();
		System.out.print("년도 입력 : ");
		year = sc.nextInt();
		System.out.print("인치 입력 : ");
		inch = sc.nextInt();
	}
	
	void showinfo()
	{
		System.out.printf("회사 : %s\n", corporation);
		System.out.printf("년도 : %d\n", year);
		System.out.printf("인치 : %d\n", inch);
	}
	
}

public class C05TVMain {

	public static void main(String[] args) {
		TV myTV = new TV();
		myTV.input();
		System.out.println("------------");
		myTV.showinfo();

	}

}

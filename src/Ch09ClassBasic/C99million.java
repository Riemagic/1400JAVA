package Ch09ClassBasic;

import java.util.Scanner;
import java.util.Random;

class idol
{
	String[] idollist = {"하루카", "치하야", "미키", "야요이", "이오리", "아즈사", "히비키", "아미", "마미", "리츠코", "유키호", "타카네", "마코토",
	"미라이", "코토하", "카나", "아리사", "나오", "유리코", "사요코", "마츠리", "에밀리", "노리코", "우미", "이쿠", "미나코",
	"시즈카", "줄리아", "치즈루", "리오", "토모카", "메구미", "모모코", "로코", "아유무", "스바루", "시호", "미즈키", "츠무기",
	"츠바사", "아카네", "카렌", "카오리", "코노미", "레이카", "후카", "안나", "세리카", "히나타", "타마키", "엘레나", "미야"};
	
	void Main()
	{
		Random rand = new Random();
		String Answer = idollist[rand.nextInt(52)];
		System.out.print("1.정답입력\n2.힌트\n0.종료 : ");
		int command = sc.nextInt();
		while(true)
			if(command == 2)
			{
				if(Answer == "하루카")
					System.out.println("머장");
			
				else if(Answer == "치하야")
					System.out.println("72");
			
				else if(Answer == "미키")
					System.out.println("일베");
			
				else if(Answer == "야요이")
					System.out.println("모야시");
			
				else if(Answer == "이오리")
					System.out.println("이마");
			
				else if(Answer == "아즈사")
					System.out.println("가슴");
				break;
			}
	}

	Scanner sc = new Scanner(System.in);

}

public class C99million {

	public static void main(String[] args) {
		idol set = new idol();
		set.Main();

	}

}


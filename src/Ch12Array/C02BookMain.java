package Ch12Array;

import java.util.Scanner;

class BookInfo
{
	int bookCode;
	String bookTitle;
	String Publisher;
	
	@Override
	public String toString() {
		return "bookCode=" + bookCode + "\nbookTitle=" + bookTitle + "\nPublisher=" + Publisher + "\n";
	}
	
	
}

public class C02BookMain {

	public static void main(String[] args) {
		BookInfo list [] = new BookInfo[3];
		Scanner sc = new Scanner(System.in);
		
		//list 의 요소마다 BookInfo객체 연결
		for(int i = 0; i < 3; i++)
		{
			list[i] = new BookInfo();
		}

		for(BookInfo book : list)
		{
			System.out.print("코드 입력 : ");
			book.bookCode = sc.nextInt();
			System.out.print("제목 입력 : ");
			book.bookTitle = sc.next();
			System.out.print("출판사 입력 : ");
			book.Publisher = sc.next();
		}
		
		for(BookInfo book : list)
		{
			System.out.println(book.toString());	//모든 필드의 값이 출력되게 BookInfo의
													//toString()재정의 할 것
		}
		
		sc.close();
		

	}

}

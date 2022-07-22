package Ch11Array;

public class C05Array {

	public static void main(String[] args) {
		
		int arr[][] =
			{
					{10, 20},			//[0][0] [0][1]
					{30, 40, 50},		//[1][0] [1][1] [1][2]
					{50, 60, 70, 80},	//[2][0] [2][1] [2][2] [2][3]
					{90, 100}			//[3][0] [3][1]
			};
		
		System.out.println("행의 길이 : " + arr.length);
		
		System.out.println("0번 행의 길이 : " + arr[0].length);
		System.out.println("1번 행의 길이 : " + arr[1].length);
		System.out.println("2번 행의 길이 : " + arr[2].length);
		System.out.println("3번 행의 길이 : " + arr[3].length);
		
		//영상 : http://naver.me/5mr5IM4V

	}

}

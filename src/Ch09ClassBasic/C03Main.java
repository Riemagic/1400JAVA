package Ch09ClassBasic;

import java.util.Scanner;

public class C03Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C03Computer mycom = new C03Computer();
		System.out.print("시리얼 넘버 : ");
		mycom.SerialNo = sc.nextLine();
		System.out.print("CPU 스펙 : ");
		mycom.CPUSpec = sc.nextLine();
		System.out.print("RAM 스펙 : ");
		mycom.RAMSpec = sc.nextLine();
		System.out.print("DISK 스펙 : ");
		mycom.DISKSpec = sc.nextLine();
		
		System.out.println("------------------------");
		System.out.printf("시리얼넘버 : %s\nCPU스펙 : %s\nRAM 스펙 : %s\nDISK 스펙 : %s\n", mycom.SerialNo, mycom.CPUSpec, mycom.RAMSpec, mycom.DISKSpec);
		
		sc.close();
	}

}

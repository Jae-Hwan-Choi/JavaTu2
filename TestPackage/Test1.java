package TestPackage;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		while(true) {
			Scanner in = new Scanner(System.in); 
			System.out.println("1번 숫자를 입력하세요");
			int a = in.nextInt();
			in.nextLine();
			System.out.println("2번 숫자를 입력하세요");
			int b = in.nextInt();
			in.nextLine();
			Test1 sum2 = new Test1();
			int c = sum2.sum(a, b);
			System.out.println("합계는 "+c+"입니다.");
			System.out.println("계산기를 다시 시작하려면 3번 종료하려면 4번을 누르세요");
			int d = in.nextInt();
			if (d == 4) {
				System.out.println("계산기를 종료합니다.");
				break;				
			}
			
			
		}
	}

	public int sum(int a, int b) {
		return a+b;
	}
	public void CalculatingMachine() {
	}
}
	
	


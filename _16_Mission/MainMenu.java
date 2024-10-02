package _16_Mission;

import java.util.Scanner;

public class MainMenu {
	// 학생관리 메뉴와 교과목 관리 메뉴를 들어갈 수 있는 클래스입니다.
	StudentMge StudentMge = null;
	CourseMge CourseMge = null;
	LoginMge LoginMge = null;
	
	
	MainMenu(){
		if (StudentMge == null) {
			StudentMge = new StudentMge();
		}
		if (CourseMge == null) {
			CourseMge = new CourseMge();
		}
		if (LoginMge == null) {
			LoginMge = new LoginMge();
		}
		menu(); // 메뉴 메소드로 이동
	}
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("-- 수강신청 프로그램 --");
			System.out.println("   1.학생 관리");
			System.out.println("   2.교과목 관리");
			System.out.println("   3.프로그램 종료");
			int num = in.nextInt();
			in.nextLine();
			if (num == 1) {
				StudentMge.menu();
			} else if (num == 2) {
				CourseMge.menu();
			} else if (num == 3) {
				break;  
			}
		}
	}
	
	
}

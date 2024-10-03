package _16_Mission2;

import java.util.Scanner;

public class MainMenu {
	
	StudentMge StudentMge = null;
	CourseMge CourseMge = null;
	
	MainMenu(){
		if (StudentMge == null) {
			StudentMge = new StudentMge();
		}
		if (CourseMge == null) {
			CourseMge = new CourseMge();
		} menu();
	}
	
	
	public void menu() {
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("수강신청 프로그램");
			System.out.println("1. 학생관리 프로그램");
			System.out.println("2. 교과목 관리 프로그램");
			System.out.println("3. 프로그램 종료");
			System.out.println("번호를 입력하세요");
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				StudentMge.menu();
			}else if (selNum == 2) {
				CourseMge.menu();
			}else if (selNum == 3) {
				break;
			}
		}
	}

}

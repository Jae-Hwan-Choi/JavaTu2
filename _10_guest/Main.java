package _10_guest;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		guestData guest = new guestData();
		EventData event = new EventData();
		while(true) {
			System.out.println("고객관리 및 이벤트 관리 프로그램");
			Scanner in = new Scanner (System.in);
			System.out.println("1. 고객관리 페이지");
			System.out.println("2. 이벤트 페이지");
			System.out.println("3. 종료하기");
			int num = in.nextInt();
			in.nextLine();
			if (num==1) {
				guest.guestDataMenu();
			}
			if (num==2) {
				event.EventDataMenu();
			}
			if (num==3) {
				System.out.println("프로그램을 종료합니다");
				break;		// while문 종료		
			}
		}
	}
}

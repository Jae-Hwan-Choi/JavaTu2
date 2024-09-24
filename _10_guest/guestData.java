package _10_guest;

import java.util.Scanner;

public class guestData {

	Scanner in = new Scanner (System.in);
	// 의존관계 설정, 중요한것은 GuestObj객체를 만든것이 아니다.
	// GuestObj 객채의 주소값을 저장할 배열[5]을 생성한 것이다.
	// 배열도 객체입니다. guest는 참조변수이도 GuestObj객체의 주소를
	// 저장한 배열의 주소를 저장하고 있다.
	GuestObj[] guest = new GuestObj[5];

	
	public void guestDataMenu() {
		
		while(true) {
			System.out.println("관리자 시스템");
			System.out.println("1. 고객 ID등록");
			System.out.println("2. 고객 정보보기");
			System.out.println("3. 고객 수정");
			System.out.println("4. 고객 삭제하기");
			System.out.println("5. 고객 전체보기");
			System.out.println("6. 메인페이지");
			System.out.println("번호를 입력 해 주세요");
			int num = in.nextInt();
			in.nextLine();
			System.out.println(num+"번을 선택하셨습니다");
			if (num == 1) {
				idadd();
			} else if (num == 2) {
				guestinfo();
			} else if (num == 3) {
				edit();
			} else if (num == 4) {
				del();
			} else if (num == 5) {
				alllist();
			} else if (num == 6) {
				return;
			}
			else {
				System.out.println("번호를 잘못 입력했습니다.");
				break;
			}
		}
	}


	public void idadd() {
	//id와 이름을 입력받아 배열에 저장을 한다
		System.out.println("고객 등록");
		GuestObj data = new GuestObj();
		System.out.println("ID를 입력해주세요");
		data.guestId = in.nextLine();
		System.out.println("이름을 입력하세요");
		data.guestName = in.nextLine();
		for(int i=0; i<guest.length;i++) {
			if(guest[i]==null) {
				guest[i]=data;
				break;
			}
		}
		System.out.println("고객등록을 완료하였습니다.");
	}

		
	public void guestinfo() {
	// id를 입력하여 손님의 정보를 출력한다.
		System.out.println("개별조회");
		System.out.println("조회할 아이디를 입력하세요");
		String id = in.nextLine();
		for(int i = 0; i<guest.length;i++) {
			if(guest[i] !=null && guest[i].guestId.equals(id)) {
				guest[i].prt();
			}
		}
		
	}
	
	
	public void edit() {
	// id를 입력받아 수정할 고객을 찾고 이름을 변경한다
		System.out.println("개별조회");
		System.out.println("수정할 고객의 아이디를 입력하세요");
		String id = in.nextLine();
		for(int i = 0; i<guest.length;i++) {
			if(guest[i] !=null && guest[i].guestId.equals(id)) {
				System.out.println("변경할 소유자의 이름을 입력하세요");
				String newUser = in.nextLine();
				guest[i].guestName = newUser;
				break;
			}
		}
		
	}
		
	public void del() {
		System.out.println("고객 삭제");
		System.out.println("삭제할 고객번호를 입력해주세요");
		String id = in.nextLine();
		for(int i = 0; i<guest.length;i++) {
			if(guest[i].guestId.equals(id)) {
				guest[i]=null;
				System.out.println(id+" 고객을 삭제하였습니다.");
			}break;
		}		
	}	
	
	
	public void alllist() {
		System.out.println("전체보기");
		for(int i=0; i<guest.length; i++) {
			if(guest[i]!=null) {
				guest[i].prt();			
			}
		}
	}
	
}


package _10_guest;

import java.util.Scanner;

public class EventData {

	Scanner in = new Scanner (System.in);
	
	EventObj[] event = new EventObj[5];

	
	public void EventDataMenu() {
		
		while(true) {
			System.out.println("이벤트 관리 시스템");
			System.out.println("1. 이벤트 등록");
			System.out.println("2. 전체보기");
			System.out.println("3. 메인페이지");
			System.out.println("번호를 입력 해 주세요");
			int num = in.nextInt();
			in.nextLine();
			System.out.println(num+"번을 선택하셨습니다");
			if (num == 1) {
				idadd();
			} else if (num == 2) {
				alllist();
			} else if (num == 3) {
				return;
			} else {
			System.out.println("번호를 잘못 입력했습니다.");
			break;
			}
			}
	}

	public void idadd() {
	//id와 이름을 입력받아 배열에 저장을 한다
		System.out.println("이벤트 등록");
		EventObj data = new EventObj();
		System.out.println("이벤트 이름을 등록해주세요");
		data.eventName = in.nextLine();
		System.out.println("이벤트 내용을 등록해주세요");
		data.eventStory = in.nextLine();
		for(int i=0; i<event.length;i++) {
			if(event[i]==null) {
				event[i]=data;
				break;
			}
		}
		System.out.println("고객등록을 완료하였습니다.");
	}

	public void alllist() {
		System.out.println("전체보기");
		for(int i=0; i<event.length; i++) {
			if(event[i]!=null) {
				event[i].eventprt();			
			}
		}
	}
	
	
	
	
	
	
	
		
//	public void guestinfo() {
//	// id를 입력하여 손님의 정보를 출력한다.
//		System.out.println("개별조회");
//		System.out.println("조회할 아이디를 입력하세요");
//		String id = in.nextLine();
//		for(int i = 0; i<guest.length;i++) {
//			if(guest[i] !=null && guest[i].guestId.equals(id)) {
//				guest[i].prt();
//			}
//		}
//		
//	}
//	
//	
//	public void edit() {
//	// id를 입력받아 수정할 고객을 찾고 이름을 변경한다
//		System.out.println("개별조회");
//		System.out.println("수정할 고객의 아이디를 입력하세요");
//		String id = in.nextLine();
//		for(int i = 0; i<guest.length;i++) {
//			if(guest[i] !=null && guest[i].guestId.equals(id)) {
//				System.out.println("변경할 소유자의 이름을 입력하세요");
//				String newUser = in.nextLine();
//				guest[i].guestName = newUser;
//				break;
//			}
//		}
//		
//	}
//		
//	public void del() {
//		System.out.println("고객 삭제");
//		System.out.println("삭제할 고객번호를 입력해주세요");
//		String id = in.nextLine();
//		for(int i = 0; i<guest.length;i++) {
//			if(guest[i].guestId.equals(id)) {
//				guest[i]=null;
//				System.out.println(id+" 고객을 삭제하였습니다.");
//			}break;
//		}		
//	}	
//	
//	
//	public void alllist() {
//		System.out.println("전체보기");
//		for(int i=0; i<guest.length; i++) {
//			if(guest[i]!=null) {
//				guest[i].prt();			
//			}
//		}
//	}
//	
//	public void main() {
//		
//	}

}

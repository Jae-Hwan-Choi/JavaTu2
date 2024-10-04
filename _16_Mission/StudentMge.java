package _16_Mission;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentMge {
	ArrayList<StudentOne> sList = new ArrayList<>();
	private final int MAXMEBERCOUNT = 10;
	// 최대 인원수 체크용 변수 final이 있어 변수값을 변경하고 
	// 접근타입 private로 해당 클래스 내에서만 접근가능함.
	
	public void menu() {
		// 학생과 id를 입력할수 있다.
		// id는 중복될수 없다(*)
		// 학생의 이름으로 검색할 수 있다 중복 검색이 가능하다
		// 이름중 특정단어를 가진 학생을 검색할 수 있다 (*)
		// Ex) 김목현 -> 목 만검색해도 나옴
		// 학생은 10명까지만 등록 할 수 있다 단 배열은 사용하지 않는다
		
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("-- 학생 관리메뉴--");
			System.out.println("   1.학생 등록");
			System.out.println("   2.전체검색");
			System.out.println("   3.개별검색");
			System.out.println("   4.일부검색");
			System.out.println("   5.학생 삭제");
			System.out.println("   6.처음으로");
			System.out.println();
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				addId();
			}else if(selNum == 2) {
				allList();
			}else if(selNum == 3) {
				IndividualSearch();
			}else if(selNum == 4) {
				NS();
			}else if(selNum == 5) {
				delStudent();
			}else if(selNum == 6) {
				break;
			}
		}
	}
	private int IDcheck(String id) {  // 아이디 체크를 위한 메소드
		for(int i=0; i < sList.size(); i++) {
			if(sList.get(i).getSId().equals(id)) {
				return 1;
			}
		}
		return 0;
	}
	
	// 메서드 정의 - 어떤 기능을 가진 것?
	// 매개변수로 문자열을 받아서.. 콜한 곳에서 문자열을 보내면 
	private int nanoSearch(String name) {  // 이름 일부분을 검색하는 메소드
		for(int i=0; i < sList.size(); i++) {
			if(sList.get(i).getSName().contains(name)) {
				return i;
			}
		}

		return -1;
	}
	
	private void NS() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		StudentOne StudentOne = new StudentOne();
		System.out.println("조회할 이름의 일부분을 입력하세요");
		String name = in.nextLine();
		if(sList.size()>0) {			
			//for (int i=0;i<sList.size();i++) {
				if( nanoSearch(name) != -1) {
					
				}
//				if(sList.get(i).getSName().contains(name)) {
//					sList.get(i).prt();
//				}
//				if(sList.get(i).getSName().contains(name)) {
//					sList.get(i).prt();
//				}
//			}
		//	}
		}
		if(sList.size()==0) {
			System.out.println("등록된 단어가 없습니다.");
		}
	}
	
	
	private void delStudent() {
		//정보를 삭제합니다.
		System.out.println("삭제할 학생의 아이디를 입력하세요");
		Scanner in = new Scanner(System.in);
		String SId = in.nextLine();
		if(sList.size()>0) {
			for (int i = 0; i <sList.size();i++) {
				if (sList.get(i).SId.equals(SId)) {
					System.out.println("정말 삭제하시게습니까? 예 or 아니오");
					String yes = in.nextLine();
					if (yes.equals("예")) {
						sList.remove(i);
						System.out.println("삭제되었습니다.");
					}else {
						System.out.println("취소되었습니다.");
					}
				}
			}
		} 
		if(sList.size()==0) {
			System.out.println("등록된 단어가 없습니다.");
		}
	}
	private void IndividualSearch() {
		// id를 검색해 학생을 조회합니다.
		// 
		System.out.println("조회할 학생의 아이디를 입력하세요");
		Scanner in = new Scanner(System.in);
		String inputId = in.nextLine();
		if (sList.size()> 0) {
			for (int i=0; i<sList.size();i++) {
				if(sList.get(i).SId.equals(inputId)) {
					sList.get(i).prt();
					break;
				}
			}
		} 
		if (sList.size()==0) { 
			System.out.println("조회할 데이터가 없습니다.");
		}
	}

	private void allList() {
		// 전체조회
		if (sList.size()> 0) {
			for (int i=0; i<sList.size();i++) {
					sList.get(i).prt();
			}	
		}
		if (sList.size()==0) { 
			System.out.println("조회할 데이터가 없습니다.");
		}
	}

	private void addId() {
		if (sList.size()==MAXMEBERCOUNT) {
			System.out.println("더이상 추가가 불가능합니다.");
		}else {
			Scanner in = new Scanner(System.in);
			StudentOne StudentOne = new StudentOne();
			System.out.println("아이디를 입력해주세요");
			String id = in.nextLine();
			if (IDcheck(id)==1) {
				System.out.println("입력한 아이디는 중복되었습니다.");
				System.out.println("처음으로 돌아갑니다");
			}else {
				StudentOne.setSId(id);
				System.out.println("이름을 입력하세요");
				String SName = in.nextLine();
				StudentOne.setSName(SName);
				sList.add(StudentOne);
				
			}
		}
			
	}	
		
		
//		// id와 이름을 등록
//		// 아이디는 중복될 수 없다(*)
//		StudentOne Student = new StudentOne();
//		Scanner in = new Scanner(System.in);
//			while(true) {
//				System.out.println("등록할 id를 입력해 주세요");
//				String inputId = in.nextLine();
//				if (sList.size()>0)	{  // 아이디 중복확인
//					for (int i=0;i<sList.size();i++) {
//						if(sList.get(i).SId.equals(inputId)) {
//							System.out.println("해당 아이디는 이미 등록되었습니다.");						
//						}
//					}				
//				}
//			}
//		Student.setSId(inputId);
//		System.out.println("등록할 이름을 입력해 주세요");
//		String inputName = in.nextLine();
//		Student.setSName(inputName);
//		sList.add(Student);
//		System.out.println(inputId+"로 "+inputName+" 학생이 등록되었습니다: " );
//	}

	
}

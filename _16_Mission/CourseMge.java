package _16_Mission;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseMge {
	ArrayList<CourseOne> cList = new ArrayList<>();
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("-- 교과목 관리메뉴--");
			System.out.println("   1.교과목 등록");
			System.out.println("   2.전체검색");
			System.out.println("   3.개별검색");
			System.out.println("   4.교과목 삭제");
			System.out.println("   5.처음으로");
			System.out.println();
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				addCName();
			}else if(selNum == 2) {
				allCList();
			}else if(selNum == 3) {
				IndividualCSearch();
			}else if(selNum == 4) {
				delCourse();
			}else if(selNum == 5) {
				break;
			}
		}
	}
	
	private void delCourse() {
		//정보를 삭제합니다.
		System.out.println("삭제할 과목의 이름을 입력하세요");
		Scanner in = new Scanner(System.in);
		String CName = in.nextLine();
		if(cList.size()>0) {
			for (int i = 0; i <cList.size();i++) {
				if (cList.get(i).CName.equals(CName)) {
					System.out.println("정말 삭제하시게습니까? 예 or 아니오");
					String yes = in.nextLine();
					if (yes.equals("예")) {
						cList.remove(i);
						System.out.println("삭제되었습니다.");
					}else {
						System.out.println("취소되었습니다.");
					}
				}
			}
		} 
		if(cList.size()==0) {
			System.out.println("등록된 과목이 없습니다.");
		}
	}
	private void IndividualCSearch() {
		// 교과목을 검색
		// 
		System.out.println("조회할 과목을 입력하세요");
		Scanner in = new Scanner(System.in);
		String CName = in.nextLine();
		if (cList.size()> 0) {
			for (int i=0; i<cList.size();i++) {
				if(cList.get(i).CName.equals(CName)) {
					cList.get(i).prt();
					break;
				}
			}
		} 
		if (cList.size()==0) { 
			System.out.println("조회할 데이터가 없습니다.");
		}
	}

	private void allCList() {
		// 전체조회
		if (cList.size()> 0) {
			for (int i=0; i<cList.size();i++) {
					cList.get(i).prt();
			}	
		}
		if (cList.size()==0) { 
			System.out.println("조회할 데이터가 없습니다.");
		}
	}

	private void addCName() {
		// id와 이름을 등록
		// 아이디는 중복될 수 없다(*)
		CourseOne Course = new CourseOne();
		Scanner in = new Scanner(System.in);
		System.out.println("등록할 과목명을 입력해 주세요");
		String inputName = in.nextLine();
		Course.setCName(inputName);
		cList.add(Course);
		System.out.println(inputName+"이 과목으로 등록되었습니다: " );
	}

}

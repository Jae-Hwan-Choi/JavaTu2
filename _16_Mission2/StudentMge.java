package _16_Mission2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMge {
	// 학생을 등록가능, id는 중복불가, 이름으로 검색 
	// 검색어가 이름에 포함되면 포함된 학생은 모두 검색된다
	// 학생을 삭제 할 수 있다. 학생은 id를 입력하여 삭제한다
	// 학생은 최대 10명까지 등록 할 수 있다.
	// 기능은 등록, 특정인검색, 전체 검색, 삭제
	
	
	
	ArrayList <StudentOne> sList = new ArrayList<>();
	private final int MAXMEMBERCOUNT = 10; // 최대 10명 카운트 하는 파이널타입 변수
	
	
	public void menu() {
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("학생 등록 시스템");
			System.out.println("1. 학생등록");
			System.out.println("2. 전체검색");
			System.out.println("3. 개별검색");
			System.out.println("4. 학생삭제");
			System.out.println("5. 돌아가기");
			System.out.println("번호를 입력하세요");
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				addStudent();
			}else if (selNum == 2) {
				searchStudent();
			}else if (selNum == 3) {
				nanoSearch();
			}else if (selNum == 4) {
				delStudent();
			}else if (selNum == 5) {
				StartClass();
			} 
		}
	}
	private int checkId(String id) {
		for (int i=0; i<sList.size(); i++) {
			if(sList.get(i).getsId().equals(id)) {
				return 1 ;				
			}break;
		} return 0;
	}
	
	private int searchId(String search) {
		for (int i=0;i<sList.size();i++) {
			if(sList.get(i).getsId().equals(search)) {
				return i;
			}
		}return -1;
		
					
		
	}
	private void StartClass() {
		StartClass.main(null);;		
	}
	
	private void addStudent() {
		//if (sList.size()==MAXMEMBERCOUNT)
		if (sList.size()==10) { // 변수를 만들었지만 그냥 10으로 입력해봄
			System.out.println("더이상 추가할 수 없습니다.");
		}else {
			System.out.println("학생등록 시스템");
			StudentOne StudentOne = new StudentOne();
			Scanner in = new Scanner(System.in);
			System.out.println("id를 입력해 주세요");
			String id = in.nextLine();
			StudentOne.setsId(id);
			if (checkId(id) == 1) {
				System.out.println("동일한 아이디가 있습니다");			
			}else{
				System.out.println("이름을 입력해 주세요");
				String name = in.nextLine();
				StudentOne.setsName(name);
				System.out.println("전화번호를 입력해주세요");
				String tel = in.nextLine();
				StudentOne.setTelNumber(tel);
				System.out.println("학년을 숫자와 학년까지 입력해주세요");
				String grade = in.nextLine();
				StudentOne.setGrade(grade);
				System.out.println(grade+" "+id+" "+name+"님을 등록하였습니다.");
				System.out.println("등록된 전화번호는 "+tel+"입니다.");
				sList.add(StudentOne);
			}
		}		
	}
	private void searchStudent() {
		if (sList.size()==0) {
			System.out.println("조회할 데이터가 없습니다");			
		} else {
			for (int i=0; i<sList.size();i++) {
				sList.get(i).prt();
			}
		}
			
		
	}
	private void delStudent() {
		
	}
	private void nanoSearch() {
		Scanner in = new Scanner(System.in);
		System.out.println("학생 검색");
		System.out.println("학생의 아이디 입력해주세요");
		String search = in.nextLine();
		if(searchId(search)!=-1) {
			int SI = searchId(search);
			StudentOne StudentOne = sList.get(SI);
			StudentOne.prt();
			
			
		}else if(searchId(search) == -1) {
			System.out.println("해당 아이디가 없습니다.");
		}
	}
}

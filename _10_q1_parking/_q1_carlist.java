package _10_q1_parking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _q1_carlist {
	// 필요한 기능은 등록, 조회, 전체보기, 삭제를 입력받을 Scanner
	// 각각의 출력
	// 연결될 메소드(기능)
	// 배열(7개)
	_q1_cardata[] cname = new _q1_cardata[7];
	Scanner in = new Scanner(System.in);
	
	_q1_carlist(){
		while(true) {
			System.out.println("차량관리");
			System.out.println("1. 등록");
			System.out.println("2. 개별조회");
			System.out.println("3. 전체보기");
			System.out.println("4. 삭제");
			System.out.println("5. 수정");
			System.out.println("선택 >>");
			int carNum = in.nextInt();
			in.nextLine();
			System.out.println(carNum+"을 선택하셨습니다");
			if(carNum ==1) {
				add(); 
			}else if(carNum == 2) {
				cardata();
			}else if(carNum == 3) {
				allList();
			}else if(carNum == 4) {
				cardel(); 
			}else if(carNum == 5) {
				carMod(); 
			}else {
				break;
			}
		}
	}
	public void add() { 
		System.out.println("차량 등록");
		_q1_cardata mname = new _q1_cardata();
		System.out.println("소유주의 이름을 입력하세요");
		mname.name = in.nextLine();
		System.out.println("차량번호를 입력하세요");
		mname.carnum = in.nextLine();
		for(int i=0; i<cname.length; i++) {
			if(cname[i]==null) {
				cname[i]=mname;				
				break;
			}
		}System.out.println("차량등록을 완료하였습니다");
//		System.out.println("차량번호를 입력하세요");
//		_q1_cardata cnum = new _q1_cardata();
//		cnum.carnum = in.nextInt();
//		for(int i=0; i<cnumber.length; i++) {
//			if(cnumber[i]==null) {
//				cnumber[i]=cnum;
//				break;
//			}
//		}
	}
	public void cardata() {
		System.out.println("조회할 차량번호를 입력해주세요");
		String carNumber= in.nextLine();
		for(int i=0; i<cname.length;i++) {
			if(cname[i] != null && cname[i].carnum.equals(carNumber)) {
				cname[i].cardata();
			}
		}
	}
	
	public void carMod() {
		// 시나리오
		// 번호로 수정할 자동차 객체를 찾는다.
		// 번호는 수정이 불가능하다 삭제만 할 수 있고 소유자만 수정이 가능
		
		System.out.println("소유자를 수정할 차량의 번호를 입력하세요");
		String a = in.nextLine();
		for (int i = 0; i<cname.length;i++) {
			if (cname[i].carnum.equals(a)) {
				System.out.println("변경할 소유자를 입력하시오");
				String newUser = in.nextLine();
				cname[i].name=newUser;
				break;
			}
		}
		
		
	}
	
	public void allList() {  
		System.out.println("차량 전체 보기");
		for(int i=0; i<cname.length; i++) {
			if(cname[i]!=null) {
				cname[i].cardata();				
			}else {
				System.out.println("조회할 차량이 없습니다");
				break;
			}
		}
	}
	public void cardel() {
		
		System.out.println("차량 삭제");
		System.out.println("차량번호를 입력해주세요");
		String a = in.nextLine();
//		for (int i = 0; i<cname.length;i++) {
//			if (cname[i].carnum.equals(a)) {
//				cname[i]=null;
//				System.out.println(a+"번 차량을 삭제하였습니다");
//				break;
//			}
//		}
		
		for(int i=0; i < cname.length;i++) {
			if(cname[i]!=null) {
				if(cname[i].carnum.equals(a)) {
					cname[i]=null;
					System.out.println(a+"번 차량을 삭제하였습니다");
					break;
				}
			}
		}	
				
	}
	
}



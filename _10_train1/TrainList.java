package _10_train1;

import java.util.Scanner;

public class TrainList {
	TrainObj[] tList = new TrainObj[7];
	Scanner in = new Scanner(System.in);
	
	TrainList(){
		
		while(true) {
			System.out.println("기차 관리 시스템");
			System.out.println("1. 기차등록");
			System.out.println("2. 기차수정");
			System.out.println("3. 개별조회");
			System.out.println("4. 전체보기");
			System.out.println("5. 삭제");
			System.out.println("번호를 입력하세요");
			int number = in.nextInt();
			in.nextLine();
			System.out.println(number+"번을 선택하셨습니다");
			if (number == 1) {
				add();
			} else if (number == 2) {
				edit();
			} else if (number == 3) {
				one();
			} else if (number == 4) {
				list();
			} else if (number == 5) {
				del();
			} else {
				break;
			}
		}
	}
	
	
	
	
	public void add() {
		System.out.println("기차등록");
		TrainObj train = new TrainObj();
		System.out.println("기차번호를 입력해 주세요 Ex) 1111");
		train.tnum = in.nextInt();
		in.nextLine();
		System.out.println("기차시간를 입력해 주세요 Ex) 0910");
		train.time = in.nextLine();
		for(int i=0;i<tList.length;i++) {
			if(tList[i] == null) {
				tList[i] = train;
				break;
			}
		}System.out.println("입력이 완료되었습니다");
		
	}
	
	public void edit() {
		System.out.println("기차수정");
		System.out.println("수정할 기차 번호를 입력하세요");
		int tn = in.nextInt();
		in.nextLine();
		for (int i = 0; i<tList.length;i++) {
			if (tList[i].tnum == tn) {
				System.out.println("변경할 기차시간을 입력하세요");
				String ttime = in.nextLine();
				tList[i].time = ttime;
				break;
			}
		}
		
	}
	
	public void one() {
		System.out.println("개별조회");
		System.out.println("수정할 기차번호를 입력하세요");
		int tn = in.nextInt();
		for (int i = 0; i<tList.length;i++) {
			if(tList[i].tnum != 0) {
				if(tList[i].tnum == tn) {
					tList[i].TrainData();
				}
			}
		}
		
	}
	
	
	public void list() {
		System.out.println("전체보기");
		for(int i=0; i < tList.length;i++) {
			if (tList[i]!=null) {
				tList[i].TrainData();
				System.out.println("플랫폼 넘버 "+(i+1)+"번 입니다.");
			}
		}
		
	}

	public void del() {
		System.out.println("삭제하기");
		System.out.println("삭제할 기차번호를 입력해주세요");
		int tn = in.nextInt();
		for(int i=0;i<tList.length;i++) {
			if (tList[i].tnum == tn) {
				tList[i].tnum = 0;
				break;
			}
		}
	}






}

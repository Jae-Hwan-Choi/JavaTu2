package _10_train2;

import java.util.Scanner;

public class TrainList {
	String[] trainNum = {"1111","2222","3333","4444"};
	String[] trainType = {"무궁화","새마을","무궁화","새마을"};
	String[] trainTime = new String[4];
	Scanner in = new Scanner(System.in);

	TrainList(){
	
		while(true) {
			System.out.println("관리자 시스템");
			System.out.println("1. 시간등록");
			System.out.println("2. 전체보기");
			System.out.println("3. 수정");
			System.out.println("4. 전광판");
			System.out.println("번호를 입력 해 주세요");
			int num = in.nextInt();
			in.nextLine();
			System.out.println(num+"번을 선택하셨습니다");
			if (num == 1) {
				timeadd();
			} else if (num == 2) {
				list();
			} else if (num == 3) {
				edit();
			} else if (num == 4) {
				display();
			} else {
				System.out.println("번호를 잘못 입력했습니다.");
				break;
			}
		}
	}
	
	public void timeadd() {
		System.out.println("기차번호를 입력해주세요");
		String number = in.nextLine();
		for(int l=0; l<trainNum.length;l++) {
			if (!trainNum[l].equals(number)) {
				System.out.println("데이터를 잘못입력했습니다 처음으로 돌아갑니다.");
				break;			
			} else {
				System.out.println("시간을 입력해주세요");
				String time = in.nextLine();
				for(int i=0; i<trainNum.length;i++) {
					if (trainNum[i].equals(number)) {
						for(int j=0; j<trainTime.length;j++) {
							if (i==j) {
								trainTime[j] = time;
								break;
							}
						}
					}
				}
			}
		}
		
	}
	
	public void list() {
		System.out.println("전체보기");
		for(int i=0; i<trainType.length; i++) {
			if(trainType[i].equals("새마을")) {
				System.out.println("기차번호는 "+trainNum[i]+"번 기차종류는 "+trainType[i]+"* 도착시간은 "+trainTime[i]+"분 입니다.");
			}else {
				System.out.println("기차번호는 "+trainNum[i]+"번 기차종류는 "+trainType[i]+" 도착시간은 "+trainTime[i]+"분 입니다.");
			}
		}
	}
	
	public void edit() {
		System.out.println("기차번호를 입력해주세요");
		String number = in.nextLine();
		for(int l=0; l<trainNum.length;l++) {
			if (!trainNum[l].equals(number)) {
				System.out.println("데이터를 잘못입력했습니다 처음으로 돌아갑니다.");
				break;
			}else {
				System.out.println("시간을 입력해주세요");
				String time = in.nextLine();
				for(int i=0; i<trainNum.length;i++) {
					if (trainNum[i].equals(number)) {
						for(int j=0; j<trainTime.length;j++) {
							if(trainTime[i].equals(time)) {
								System.out.println("수정할 시간을 입력하세요");
								String edit = in.nextLine();
								trainTime[j] = edit;
								break;
							}	
						}
					}
				}
			}
		}
		
	}

	public void display() {
		System.out.println("전체보기");
		for(int i=0; i<trainType.length; i++) {
			System.out.println("기차번호는 "+trainNum[i]+"번 기차종류는 "+trainType[i]+" 도착시간은 "+trainTime[i]+"분 입니다.");
		}
		
	}

	
}



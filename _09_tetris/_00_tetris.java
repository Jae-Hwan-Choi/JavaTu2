package _09_tetris;

public class _00_tetris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//테트리스
		
//		int [][] a=new int[4][5];
//		
//		// 2차원 배열 a의 값을 0번행부터 모두 출력
//		for (int i=0; i<4;i++) {
//			//System.out.println(">행"+행);
//			for(int j=0; j<5; j++) {
//				System.out.print(a[i][j]+" ");
//			}System.out.println();
//		}
		
		// 김티처 생각. 많은 사람이 공감한다고 하심.
		// if, for등 작성할 때 한가지 기능만 정의하고 작성한다.
		// 한가지 기능만 정의하고 작성하는 개발자의 센스다
		
		
//		int [][] a=new int[4][5];
//		int num=1;
//		//2차원 배열의 값을 저장하는 코드
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<5; j++) {
//				//i와j값으로 배열을 순회하는 순서를 결정
//				//순회하면서 num의 값을 저장한 것
//				a[i][j]=num;
//				//저장했으니 num값을 증가시킨것.
//				num++;
//			}System.out.println(num);
//		}
		
//		int [][] a=new int[4][5];
//		int num=1;
//		
//		//2차원 배열의 값을 저장하는 코드
//		for(int 열=4; 열>=0; 열--) {
//			for(int 행=0; 행<4; 행++) {
//				a[행][열]=num;
//				num++;
//			}
//		}
		

//		//문제3
//		int [][] a=new int[4][5];
//		int num=1;
//		// 2차원 배열의 값을 저장하는 코드
//		for(int 행=0; 행<4; 행++) {
//			if(행%2==0) {
//				for(int 열=0; 열<5; 열++) {
//					a[행][열]=num++;
//					// 위 코드는 대입연산자가 일어난 후
//					// 단일 연산자인 ++이 실행된다.
//					// 만약 a[행][열]=++num;
//					// 이것은 단일 연산자가 먼저 실행되고
//					// 대입연산자가 실행된다.
//					// 첫번째 case 를 후위 단일 연산자
//					// 두전빼 case를 전위 단일 연산자.
//					// system.out.println(행+"/"+열);
//				}
//			}else {
//				for(int 열=4; 열>=0; 열--) {
//					a[행][열]=num++;
//				}
//			}
//		}
	
//		int [][] a=new int[4][5];
//		int num=1;	
//		
//		for(int i=0; i < 8; i++) {
//			System.out.println(i+"번째 채우기를 합니다.");
//			int newCol=i;
//			for(int j=0; j<=i; j++) {
//				if(j>3) continue; // if절에서 코딩이 한줄이면 괄호가 없어도 된다. 오...
////				if(j>3) break;
//				if(newCol < 5) {
//					//System.out.println("j<행>"+j+"/열"+newCol);
//					a[j][newCol]=num++;
//			}
//				newCol--;
//		}
//		}	
//	
//		for (int i=0; i<4;i++) {
//			//System.out.println(">행"+행);
//			for(int j=0; j<5; j++) {
//				System.out.print(a[i][j]+" ");
//			}System.out.println();
//		}

		// 5번문제
		int [][] a=new int[4][5];
		int num=1;	
		
		//변수 4개 만들기
		int 행최소값=0;
		int 행최대값=3;
		int 열최소값=0;
		int 열최대값=4;
		
		for(int j=0; j<2; j++) {
			// 맨 위에 부분 숫자 채우기
			// 맨 위의 행최소값 0 열 최소값0 열최대값4
			// 맨 위(두번째는 행최소값1 열최소값1 열최대값3)
			for(int i=열최소값; i <=열최대값; i++) {
				a[행최소값][i]=num++;
			}
			// 위 반복문이 완료되었다면 0번행은 채울 필요없다.
			// 행의 최소값을 증가시켜 버린다.
			행최소값++;
			for (int i = 행최소값; i<=행최대값; i++) {
			a[i][열최대값]=num++;
			}
			열최대값--;
			for(int i=열최대값; i>=열최소값; i--) {
				a[행최대값][i]=num++;
			}
			행최대값--; // 행 12 열은 0 3
			for(int i=행최대값; i>=행최소값; i--) {
				a[i][열최소값]=num++;
			}
		}
		
	
		// 2차원 배열 a의 값을 0번행부터 모두 출력
		for (int i=0; i<4;i++) {
			//System.out.println(">행"+행);
			for(int j=0; j<5; j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}

	
	
	}
}

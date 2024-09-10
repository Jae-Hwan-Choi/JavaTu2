package _08_array2;

public class _Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5. 전체 배열의 값 중 홀수를 0으로 마스킹 하고 , 마스킹 된 결과 2차원 배열을 출력하시오
		/*
		 * 전체 배열 중 홀수를 찾아야 한다 반복적으로 % 2 == 1을 입력해봐야 하고
		 * 배열이 2중이니 이중 for문을 사용해야 한다
		 * 
		 * i는 행 j는 열로 한다
		 * 
		 * 홀수를 찾으면 그 수를 0으로 치환해야 한다
		 * 
		 * 치환한 수를 
		 * 0 2 0 4 0
		 * 6 0 8 0 10
		 * 0 12 0 14 0
		 * 
		 * 이런식으로 출력을 해야한다
		 * 
		 */
		
		int[][] a = {{1,2,3,4,5},				
				 	 {6,7,8,9,10},
				 	 {11,12,13,14,15},
				 	 {16,17,18,19,20},
				 	 {21,22,23,24,25}};
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(a[i][j]%2==1) {
					a[i][j]=0;				
				} System.out.print(a[i][j]+" ");
			} System.out.println();
		} 
		
		
	}
}

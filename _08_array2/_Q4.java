package _08_array2;

public class _Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4. 전체 배열의 값 중 짝수는 모두 몇개인가
		

		int[][] a = {{1,2,3,4,5},				
				 	 {6,7,8,9,10},
				 	 {11,12,13,14,15},
				 	 {16,17,18,19,20},
				 	 {21,22,23,24,25}};
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			for (int j=0;j <5; j++) {
				if (a[i][j]%2 == 0){
					cnt++;
				}
			}
		} System.out.println(cnt);
		
	}

}

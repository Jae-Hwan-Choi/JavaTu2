package _08_array2;

public class _Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. 2차원 배열의 모든 값을 출력하시오
		

		int[][] a = {{1,2,3,4,5},				
				 	 {6,7,8,9,10},
				 	 {11,12,13,14,15},
				 	 {16,17,18,19,20},
				 	 {21,22,23,24,25}};
		for (int i = 4; i >= 0 ; i--) {
			for (int j = 4; j >= 0 ; j--) {
				System.out.print(a[i][j]+" ");
			} System.out.println();
		} 
		
	}

}

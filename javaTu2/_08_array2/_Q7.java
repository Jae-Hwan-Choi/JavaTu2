package _08_array2;

public class _Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,1,0,2},
					  {3,2,1,2},
					  {0,0,3,2},
					  {4,4,4,4},
					  {2,4,3,1},
					  {2,4,1,3}};
				
		// 위와같은 게임배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다
		// 제거가 가능한 블록의 좌표를 출력하시오

		int cnt = 0;
		int bt = a[0][0];
		int maxLength = 0;
		int maxIndex = 0;
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++){
				if (a[i][j] == bt) {
					cnt++;
				}else {cnt = 1; bt = a[i][j];
				} System.out.println(a[i][j]+" "+cnt);
			}if(maxLength< cnt) {
				maxLength = cnt;
				maxIndex = bt;
			}
		}System.out.println(maxLength);  System.out.println(maxIndex);
		

	
	
	}
}

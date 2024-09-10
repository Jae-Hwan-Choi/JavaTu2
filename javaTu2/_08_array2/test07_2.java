package _08_array2;

public class test07_2 {

	public static void main(String[] args) {
		// 박연정 
		int[][] a = {{1,1,0,2},
			     {3,2,1,2},
			     {0,0,3,2},
			     {4,4,4,4},
			     {2,4,3,1},
			     {2,4,1,3}};
	
	int ers = 0;
	int cnt = 1;
	
	
	for (int i = 0; i < a[0].length; i++) {
		for (int j = 0; j < a.length-1; j++) {
//			System.out.print(a[j][i]+" ");
			if(a[j][i]==a[j+1][i]) {
				cnt++;
			}else {
				cnt=1;
			}
			if(cnt>=3) {
				System.out.println("제거대상의 번호는: "+a[j][i]);
				ers = a[j][i];
				for (int k = 0; k < a.length; k++) {
					if(a[k][i]==ers) {
						System.out.println("좌표는 "+k+", "+i);
					}
					cnt=1;
				}
			}
		}
	System.out.println();
	cnt=1;
	ers=0;
	}
	}

}

package _0812mission;

public class _07 {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		 * 철수는 배열의 0번 인덱스부터 순회한다.
		 * 0번 인덱스에서는 0번인덱스와 그 다음 인덱스를 비교하여 큰 수를 뒤로 배치한다.
		 * 이러한 방식으로 배열의 뒤까지 반복하면 맨 뒤에 가장 큰 수가 배치 될 것이다.
		 * 위와 같은 방식으로 가장큰 수를 구하시오
		 * 
		 * 분석 
		 * 배열을 순회하며 앞 인덱스의 수와 뒤 인덱스의 수를 비교
		 * 숫자를 비교해 큰수를 뒤로 작은수를 앞으로 배치
		 * 
		 * 진행 
		 * 배열의 순회를 위해 반복문을 작성합니다.
		 * 배열을 순회하면서 다음 인덱스와 비교하여 현재의 인덱스가 
		 * 다음 인덱스보다 큰지 확인후 현재 인덱스가 크다면
		 * 위치를 바꿉니다. 다만 단순 대입할 경우 변경된 인덱스의
		 * 자료가 사라지므로 해당 인덱스를 빈공간에 넣은 후 
		 * 큰 인덱스가 옮겨 간 뒤 다시 새로운 인덱스로 변경합니다
		 * 
		 */
		
		int[] a = {34,2,35,8,31,45};
		int temp = 0;
		for (int i = 0; i < a.length-1; i++) {
//			System.out.print(a[i]+" ");
			if (a[i] > a[i+1]) {
				temp = a[i+1];
				a[i+1] = a[i];
				a[i] = temp;				
			} 

		} System.out.println(a[1]);
		
		
		
	}

}
// 2 34 8 31 35 45 이 순서대로 변경이 되어야 함
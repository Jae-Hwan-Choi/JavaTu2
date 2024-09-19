package _나머지공부;

public class _q0812 {

	public static void main(String[] args) {
		// 
		// 선택받은너
		// 
		// 짝수만 출력하시오.

//		int[] l={8,12,4,13,2,14,4,5};
//		for(int i=0; i<l.length; i++) {
//			if(l[i]%2==0) System.out.print(l[i]+" ");
//		}

		
		// 배열의 가장 큰수가 있는 인덱스를 출력하시오.
		
//		int[] letter={8,12,4,13,2,14,4,5};
//		int bignum = 0;
//		int index = 0;
//			for(int i =0; i <letter.length; i++) {
//				if (letter[i] > bignum) {
//					bignum = letter[i];
//					index = i;
//				}System.out.println(index);					
//			}
		
				
//		2 현상수배
//		범인을찾으시오
//		범인은 짝수이면서 가장큰 값이다. 
//		범인은 14입니다. 
		
//		int[] letter={8,12,4,13,25,14,4,5};
//		int bignum=0;
//		int even = 0;
//		for(int i=0; i<letter.length;i++) {
//			if(letter[i]%2==0) {
//				even = letter[i];
//				//System.out.println("짝수는"+even);
//				if (even > bignum) {
//					bignum = even;
//				}
//			}
//		}System.out.println("범인은 "+bignum+"입니다");
		
		//3 비밀편지
		//letter  배열은 word문자열 알파벳의 위치이다.
		//letter배열의 암호를 풀어서 편지의 내용을 출력하시오. 

//		String word ="gehoudfkimjnlvy";
//		int[] letter={8,12,3,13,1,14,3,4};
//		for (int i = 0; i < letter.length; i++) {
//			char a = word.charAt(letter[i]);
//			System.out.print(a);
//		}
		//4 난건물주
		//arr 배열에서 0이 의미하는 것은 공터이다. 
		//size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		//size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		//size가 2일경우에 7개이다. 
		
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
		int cnt=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]+arr[i+1]==0) {
				cnt++;
				System.out.println(cnt);
			}
		}
		
	}
}

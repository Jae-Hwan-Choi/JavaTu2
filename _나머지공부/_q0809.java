package _나머지공부;

public class _q0809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 문제1 100부터 999까지의 숫자중에서 홀수만 출력하세요
		
//		for(int i = 100; i <=999; i++) {
//			if (i % 2 == 1) {
//				System.out.println(i);
//			}
//		}
		
		
		// 문제2 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
//		int sum = 0;
//		for(int i = 1; i <=100; i++) {
//			if (i % 2 == 1) {
//				sum += i;
//				//System.out.println(sum);
//			}
//		}
//		System.out.println(sum);
		
		
		// 문제3 다음과 같이 출력하시오 10 9 8 7 6 5 4 3 2 1
//		for (int i = 10; i >= 1; i--) {
//			System.out.print(i+" ");
//		}

//		int[] arr = {45,23,25,64,3,24,48};
		// 문제4 배열에서 배열의 값이 짝수인 것만 출력하시오.
//		for(int i = 0; i<arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				System.out.println(arr[i]);
//			}
//		}
		
		// 문제5 배열에서 배열의 값이 홀수 인곳의 인덱스만 출력하시오
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 1) {
//				System.out.println(i);
//			}
//		}

		
		// 배열의 값을 모두 더한 총합을 구하시오
//		int sum = 0;
//		for (int i = 0; i <arr.length; i++) {
//			sum += arr[i];
//		}System.out.println(sum);
//
//		
//		// 짝수는 모두 몇개인가요?
//		int cnt = 0;
//		for (int i = 0; i<arr.length; i++) {
//			if (arr[i] % 2 ==0) {
//				cnt++;
//			}
//		}System.out.println(cnt);
		

	
		// 문제9 변수, 연산자, 조건문, 반복문을 생각하면 해결 할 수 있습니다.
		// 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
//		int cnt = 0;
//		String test = "abcdeabce";
//			for(int i=0; i < 9; i ++){
//			char aaa = test.charAt(i);
////			System.out.println(aaa);
//				if (aaa == 'a') {
//					cnt++;
//				}
//		    }System.out.println(cnt); 

	
		// 배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오
		
//		int bignum = 0;  // 큰수를 저장할 변수 
//		int bigarr = 0;  // 해당 인덱스를 저장할 변수
//		int[] arr = {45,23,25,64,3,24,48};
//		for (int i=0; i < arr.length; i++) {
//			if (arr[i] > bignum ) {  // 해당인덱스를 순회중 bignum 변수에 저장돼 있는 숫자보다 인덱스 안의 숫자가 더 크면
//				bignum = arr[i];  // 해당 인덱스 안의 데이터를 bignum으로 바꾸고
//				bigarr = i; // 해당인덱스의 번호도 변경한다.
//			}
//		}
//		System.out.println("가장 큰 숫자는 "+bignum+", 해당 인덱스는 "+bigarr+"입니다");
		
		// 범인은 100부터 999까지 숫자중 여러명이다. 
		// 범인의 특징은 숫자의 각 자릿수를 더한 값이 짝수이다. 범인의 숫자를 모두 찾으시오
		
		// 짝수를 찾아야 하고.. 그 수를 또 분해해야함... 분해할걸 또 합쳐야 하고.....
		
		
//		int sum1 = 0;
//		int sum2 = 0;
//		int sum3 = 0;
// 		for(int i = 100; i <= 999; i++) {
//			if(i % 2 == 0) {
//				sum1=i%1000/100;
//				sum2=i%100/10;
//				sum3=i%10;
//				System.out.println("100단위,"+sum1+" 10단위,"+sum2+" 1단위,"+sum3);
//				int sum4 = sum1+sum2+sum3;
//				if(sum4 % 2 == 0) {
//					System.out.println(sum4);	
//				}
//			}
//		}

 		
 		// 0은 터널이다. 가장 긴 터널의 길이를 구하시오.
		// 순회를 해야하고.. 연속으로 이어진 숫자를 찾아야 하고 최종까지 돌았을때도 
	    // 카운트를 두개를? 하나는 순회하면서 카운트를 하는데 결론은 0이 5번째일때 카운트1과 카운트2가
		// 5이지만 그 후 0이 아닌 3이 나오면 카운트 1은 0으로 바뀌지만 카운트 2는 안바뀌게?
		
//		int cnt = 0;
//		int maxlength = 0;
//		int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};     
// 		for(int i=0; i <arr.length; i++) {
// 			if (arr[i] == 0) {
// 				cnt++; 				
// 			}else {
// 				cnt=0;
// 			}if(cnt>maxlength) {
// 				maxlength=cnt;
// 			}
// 		}System.out.println(maxlength);		    

 		// 숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
 		int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3};
 		
	
	}
}

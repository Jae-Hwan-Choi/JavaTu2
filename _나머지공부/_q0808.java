package _나머지공부;

public class _q0808 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제1 1부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 1개를 출력하시고
		// for문으로 1-100까지 순회
		// 각각 순회마다 홀수와 짝수를 구분하여야 하니 if문으로 홀짝 확인
		// 홀이면 + 짝이면 - 하여 
		// sum 변수에 저장 
		
		
//		int sum = 0; 
//		for(int i = 1; i <= 100; i++) {
//			if (i % 2 == 1) {
//				sum = sum+i;
//			}else {
//				sum = sum-i;
//			}
//		}System.out.println(sum);
		
		// 문제2 1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값을 짝수는 짝수끼리 더한 값을 각각출력하시오
		// 반복문으로 1-100까지 순회하여 홀수와 짝수를 각각의 변수에 넣어 
		
//		int sump = 0;
//		int summ = 0;
//		for(int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				summ = i+summ;
//			}else {
//				sump = i+sump;
//			}
//		}System.out.println("홀수를 더한값은 "+sump+", 짝수를 더한 값은 "+summ+"입니다");
		
		
		// 문제3 1부터 100까지 숫자중 홀수는 모두 몇개인가?
		// for문으로 순회, 홀수를 찾아 cnt변수에 저장
		
//		int cnt = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 != 0) {
//				cnt++;
//			}
//		}System.out.println(cnt);
		
		// 문제4 100부터 999까지의 숫자의 모든 숫자의 합을 구하시오
		// 더한 값을 분해하여 그 합을 구하시오
		//
		// 각각 합을 구한 뒤 총합을 %로 분해하여 그 값을 더한다 
		// 총 합의 자릿수를 모르기때문에 임의로 100,000단위까지 나누기
		// 총 합은 494550

//		int[] a = new int[8];
//		int sum = 0;
//		int sumb= 0;
//		for(int i = 100; i <= 999; i++) {
//			sum = sum+i;
//		}
//		a[0] = sum%1000000/100000;;
//		System.out.println(a[0]);
//		a[1] = sum%100000/10000;;
//		System.out.println(a[1]);
//		a[2] = sum%10000/1000;;
//		System.out.println(a[2]);
//		a[3] = sum%1000/100;;
//		System.out.println(a[3]);
//		a[4] = sum%100/10;;
//		System.out.println(a[4]);
//		a[5] = sum%10;
//		System.out.println(a[5]);
//		for(int i = 0; i < a.length; i++) {
//			sumb = sumb+a[i];
//		}System.out.println(sumb);

		
		// 범인은 100부터 999까지 숫자에 숨어 있다.
		// 범인은 십의 자리에 있고 3의 배수이다. 범인의 숫자를 모두 출력하시오
		
		// 순회후 3의 배수를 찾아야 하는데 10의 자리니 % 연산자로 10 단위로 나눈후 
		// 그 값이 3의 배수으면 출력하게 한다
		
//		int a = 0;
//		for(int i=100; i<=999; i++) {
//			a = i%100;
//			if(a % 3 == 0) {
//				if(a == 0 || a == 3 || a == 6 || a == 9) {
//					System.out.print("");
//				}else {
//					System.out.println(a);
//				}
//			}
//		} 
	
//		String p = "+";
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 4;
//		int e = 5;
//		int f = 6;
//		int g = 7;
//		int h = 8;
//		int i = 9;
//		int j = 10;
//		
//		System.out.print(a);
//		System.out.print(p);
//		System.out.print(b);
//		System.out.print(p);
//		System.out.print(c);
//		System.out.print(p);
//		System.out.print(d);
//		System.out.print(p);
//		System.out.print(e);
//		System.out.print(p);
//		System.out.print(f);
//		System.out.print(p);
//		System.out.print(g);
//		System.out.print(p);
//		System.out.print(h);
//		System.out.print(p);
//		System.out.print(i);
//		System.out.print(p);
//		System.out.print(j);
//		System.out.print(p);
//		System.out.print("=");
//		System.out.print(a+b+c+d+e+f+g+h+i+j);
		
		
		// 피보나치 수열 1
		// 1부터 8까지 증가
		
		int a = 1; // 파보나치 수 1 1 2 3 5 8 13
		int b = 0;
		for (int i = 1; i < 8; i++) { // 피보나치 수의 개수 i
			System.out.println(a);
			int temp = a;
			a = b+a;
			b=temp;
		}

		
		// 문제10 987654321이라는 숫자가 있다. 변수 2개와 for문 한개로 모든 자릿수를 더한 합을 구하시오
		// 합만 출력하면 됩니다. main 메서드 안의 라인수를 최소화 하여서 작성하세요.
		// 9+8+7+6+5+4+3+2+1 = 합
		
			
	}

}

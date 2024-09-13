package _나머지공부;

public class _q0806 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1 30,40,50,60,55를 배열에 저장하고 모든 배열의 값을 출력하시오
		
//		int[] a = {30,40,50,60,55};
//			System.out.print(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" ");
		
		
		// kim lee park 3개의 값을 배열에 저장하고 출력하시오
//		String [] firstname = {"kim","lee","park"}; 
//			System.out.println(firstname[0]+" "+ firstname[1]+" "+ firstname[2]+" ");
		
		// 문제3 6,12,33,4,5,26 3번째 값에 +2를 더하시오
//		int [] lotto = {6,12,33,4,5,26};
//		System.out.println(lotto[2]+2);
		
		// int [] lotto = {6,12,33,4,5,26};
		// 문제4 홀수 번째로 뽑은 번호의 총합을 구하시오. 단 저장된 로또 번호의 값은 유지
//		System.out.println(lotto[0]+lotto[2]+lotto[4]);

		// 문제5 첫번째 번호는 그대로 저장 + 두번째 번호 순으로 모두 저장하시오
//		int cnt = 0;
//		cnt = lotto[0];
//		System.out.println(cnt);
//		cnt = cnt + lotto[1];
//		System.out.println(cnt);
//		cnt = cnt + lotto[2];
//		System.out.println(cnt);
//		cnt = cnt + lotto[3];
//		System.out.println(cnt);
//		cnt = cnt + lotto[4];
//		System.out.println(cnt);
//		cnt = cnt + lotto[5];
//		System.out.println(cnt);
		
		// 4번째 로또번호가 홀수이면 true, 짝수이면 false를 출력하시오  
//		System.out.println((lotto[3]%2)!=0);
		
		// 문제7 거스름돈을 풀어보자
		// 출력은 천원은 7개 백원은 2개 10원은 5개  =>답은 찾았으나 왜 답이 나온건질 모르겠음
		int pay = 10000;
		int money = 2750;
		int sum = 0;
		int s1000 = 0;
		int s100 = 0;
		int s10 = 0;
		sum = pay-money;
		System.out.println(sum);
		s1000 = sum%10000/1000;
		System.out.println(s1000);
		s100 = sum%1000/100;
		System.out.println(s100);
		s10 = sum%1000/10;
		System.out.println(s10);
		System.out.println("천원은 "+s1000+"개"+" 백원은"+s100+" 개 "+"십원은 "+s10+"개 입니다.");
		
		
		
		
		
		
	}

}

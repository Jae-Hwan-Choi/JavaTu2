package _나머지공부;

public class _q0807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 평균을 저장하는 변수를 만들고 89.2라고 저장하시오
		// 평균이 80점 이상이면 합격, 80점 미만이면 불합격이라고 출력하시오
		
//		double avg = 89.2;
//		if (avg > 80) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}

		//level이 1이면 포인트에 30을 더하고 1이 아니면 포인트에 10을 더하시오 sysout은 한번만
//		int level = 2;
//		int point = 30;
//		if (level == 1) {
//			point = point+30;
//		}else {
//			point = point+10;
//		}System.out.println(point);
		
//		int [] lotto = {6,12,33,4,5,26};
		// 3번째 값에 80을 더하시오
//		lotto[2] = lotto[2]+80;
//		System.out.println(lotto[2]);
		
		// 4번째 번호가 홀수이면 홀수, 짝수이면 짝수라고 출력하시오
//		if (lotto[3]%2==1) {
//			System.out.println("홀수");
//		}else {
//			System.out.println("짝수");
//		}
		
		// 홀수인 로또 범호의 합을 구하시오
//		int cnt = 0;
//		if (lotto[0]%2==1) {
//			cnt = cnt+lotto[0];
//		}if (lotto[1]%2==1) {
//			cnt = cnt+lotto[1];
//		}if (lotto[2]%2==1) {
//			cnt = cnt+lotto[2];
//		}if (lotto[3]%2==1) {
//			cnt = cnt+lotto[3];
//		}if (lotto[4]%2==1) {
//			cnt = cnt+lotto[4];
//		}if (lotto[5]%2==1) {
//			cnt = cnt+lotto[5];
//		}System.out.println(cnt);
		
		// 숫자의 모든합을 구하시오
//		int[] a = {45,34,64,45,24};
//		int cnt = 0;
//		System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
		
		// 철수는 숫자를 0번째부터 2번째까지 차례대로 수집했다.
		// 철수는 숫자의 자릿수를 분해하여 합한 결과 값이 가장 큰 숫자를 선택 할 예정이다.
		// 숫자를 분해하는 것은 45인 경우 4+5를 의미한다
		// 철수가 선택 할 숫자는 몇 번째 수집한 숫자인가?
		
		// 나머지 연산자로 분리한것을 변수에 저장 후 합하고 
		// 저장한 합과 분리후 저장한것을 비교하여 대입 연산자로 교체
		
		int count = 0;
		int sn = 0;
		int sm = 0;
		int s3 = 0;
		
		int[] a = {45,34,64};
		sn = a[0] % 100/10;
		sm = a[0] % 10;
		s3 = sn + sm;	
//		System.out.println(s3);
		sn = a[1] % 100/10;
		sm = a[1] % 10;
		if (sn+sm > s3) {
			s3 = sn+sm;
			count = 2;
		}
//		System.out.println(count);
		sn = a[2] % 100/10;
		sm = a[2] % 10;
		if (sn+sm > s3) {
			s3 = sn+sm;
			count = 3;
		}
		System.out.println("철수가 수집한 숫자는 "+count+"번째 숫자입니다");

	
	
	
	}
}

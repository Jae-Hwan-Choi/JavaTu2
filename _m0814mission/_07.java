package _0814mission;

public class _07 {

	public static void main(String[] args) {

		int[] jobTime ={40,32,4,16,5,8};
		int a = 0;  
		int b = jobTime.length; 
		int time=4;  
		int c=0; 
		for(;;) {
			if(jobTime[a] > 0) {   
				System.out.print(a+" 사용중입니다.  ");
				jobTime[a] -= time;  
				System.out.println(jobTime[a]+" 남았습니다.");
				if(jobTime[a] <= 0 ){ 
					System.out.println(a +"이용을 완료하였습니다.");
					c++;
				}
				if(c == b ) {   
					break;
				}			
			}
			
			a ++;
			a = a%b;
			System.out.println(a +" 차례입니다.");
		}
	}

}

package _052for;

public class Q_9 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 String a = "aabbccddeeeaaaa";
		        int aa = 0;
		        int bb = 1; 
		        int cc = a.length();
		        for (int i = 1; i < cc; i++) {
		            if (a.charAt(i) == a.charAt(i - 1)) {
		                bb++;
		            } else {
		                if (bb > aa) {
		                    aa = bb;
		                }
		                bb = 1; 
		            }
		        }
		        if (bb > aa) {
		            aa = bb;
		        }
		        System.out.println("가장 긴 연속 문자 길이: " + aa);

		}

}

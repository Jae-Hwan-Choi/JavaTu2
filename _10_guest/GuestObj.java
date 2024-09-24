package _10_guest;

public class GuestObj {
	String guestName = null;
	String guestId = null;
	
	public void prt() {
		System.out.println("--- Guest Info ---");
		System.out.println("고객님의 ID는 "+guestId+"입니다.");
		System.out.println("고객님의 이름은 "+guestName+"입니다.");
		
	}
}

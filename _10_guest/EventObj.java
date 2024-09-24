package _10_guest;

public class EventObj {
	String eventName = null;
	String eventStory = null;

	public void eventprt() {
		System.out.println("--- Guest Info ---");
		System.out.println("이벤트 이름은 "+eventName+"입니다.");
		System.out.println("고객님의 이름은 "+eventStory+"입니다.");
		
	}
}

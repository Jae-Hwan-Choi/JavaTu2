package _11_method;

public class Main1 {

	public static void main(String[] args) {
		testMethod t = new testMethod();
		System.out.println(t.name);
		t.setName("hong"); // 메소드 호출
		System.out.println(t.name);
		System.out.println(t.maskName("****"));
	}
	

}

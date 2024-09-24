package _11_method;

public class testMethod {
	// 생성자는 눈에 안보이지만 생략되어 있음
	
	
	// 이름뒤에 마스킹을 해주는 메서드를 만들기
	// 호출할 때 문자열로 마스킹 문자를 지정하면, 
	// 이름뒤에 마스킹 문자를 연결하여 리턴 한다.
	// 메서드 명은 maskName
	
	public String maskName(String Masking) {
		String maskingName = name + Masking;
		return maskingName;
	}
	
	
	
	String name = null;
	
	public String getName2(String pwd) {
		if (pwd.equals("1111")) {
			return name;
		}else {
			return null;
		}
		
	}
	public void setName(String n) {  // 메소드 정의
		name=n;
	}
	public String getName() {  // 메소드 정의 
		return name;
	}
}

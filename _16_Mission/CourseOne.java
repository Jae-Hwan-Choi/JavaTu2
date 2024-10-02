package _16_Mission;

public class CourseOne {
	String CName = null; // 학생 id
	public void prt() {
		System.out.println("----- 교과목 정보 -----");
		System.out.println("과목 이름: "+CName);
	}
		
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	
}

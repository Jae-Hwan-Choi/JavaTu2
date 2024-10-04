package _16_Mission2;

public class StudentOne {
	// 아이디, 이름, 전화번호, 학년
	String sId = null;
	String telNumber = null;
	String grade = null;
	String sName = null;
	
	public void prt() {
		System.out.println("-- 학생정보 --");
		System.out.println(grade+" "+sId+" "+sName+"님");
		System.out.println("전화번호는 "+telNumber+" 입니다.");
			
		
	}
	
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}

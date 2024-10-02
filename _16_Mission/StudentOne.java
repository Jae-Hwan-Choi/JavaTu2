package _16_Mission;

public class StudentOne {
	String SId = null; // 학생 id
	String SName = null; // 학생 이름
	
	public void prt() {
		System.out.println("----- 학생 정보 -----");
		System.out.println("학생 ID: "+SId);
		System.out.println("학생 이름: "+SName);
	}

	
	
	public String getSId() {
		return SId;
	}
	public void setSId(String sId) {
		SId = sId;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}

}

package oops;

public class AccessModifierExample {
	String name;
	public int rollNo;
	protected int std;
	private static String institute="Oxford";
	
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getInstitute() {
		return this.institute;
	}


}

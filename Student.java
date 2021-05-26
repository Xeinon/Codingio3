package Codingio;

public class Student extends User{
	private String studentInformation;
	private String adress;
	public Student(int id, String firstName, String lastName, String email, int password, String studentInformation, String adress) {
		super(id,firstName,lastName,email,password);
		this.studentInformation = studentInformation;
		this.adress = adress;
	}
	public String getStudentInformation() {
		return studentInformation;
	}
	public void setStudentInformation(String studentInformation) {
		this.studentInformation = studentInformation;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	

	
}

package Codingio;

public class Instructor extends User {

	private String yourInstructor;
	
	public Instructor(int id, String firstName, String lastName, String email, int password, String yourInstructor) {
		super(id, firstName, lastName, email, password);
		this.yourInstructor = yourInstructor;
	}
	public String getYourInstructor() {
		return yourInstructor;
	}
	public void setYourInstructor(String yourInstructor) {
		this.yourInstructor = yourInstructor;
	}
	

}

package bean;

public class Patient extends Person {
	private String symptoms;
	private String illness;
	private String illnessDuration;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient( String password, String name, int age, String gender, String contactNumber,
			String department) {
		super( password, name, age, gender, contactNumber, department);
		// TODO Auto-generated constructor stub
	}
	public Patient(int personId, String password, String name, int age, String gender, String contactNumber,
			String department) {
		super(personId, password, name, age, gender, contactNumber, department);
		// TODO Auto-generated constructor stub
	}
	public Patient(String symptoms, String illness, String illnessDuration) {
		super();
		this.symptoms = symptoms;
		this.illness = illness;
		this.illnessDuration = illnessDuration;
	}
	@Override
	public String toString() {
		return "Patient [symptoms=" + symptoms + ", illness=" + illness + ", illnessDuration=" + illnessDuration
				+ ", getPersonId()=" + getPersonId() + ", getPassword()=" + getPassword() + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getGender()=" + getGender() + ", getContactNumber()="
				+ getContactNumber() + ", getDepartment()=" + getDepartment() + "]";
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getIllness() {
		return illness;
	}
	public void setIllness(String illness) {
		this.illness = illness;
	}
	public String getIllnessDuration() {
		return illnessDuration;
	}
	public void setIllnessDuration(String illnessDuration) {
		this.illnessDuration = illnessDuration;
	}
	
	
	
}

package bean;

public class Doctor extends Person {

	private String Specialization;
	private int experienceInYears;
	private int casesHandled;
	private boolean isAvailable = true;
	
	public Doctor() {
		super();
	}
	public Doctor(int personId, String password, String name, int age, String gender, String contactNumber,
			String department) {
		super(personId, password, name, age, gender, contactNumber, department);
	}
	public Doctor(String specialization, int experienceInYears, int casesHandled, boolean isAvailable) {
		super();
		Specialization = specialization;
		this.experienceInYears = experienceInYears;
		this.casesHandled = casesHandled;
		this.isAvailable = isAvailable;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public int getExperienceInYears() {
		return experienceInYears;
	}
	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}
	public int getCasesHandled() {
		return casesHandled;
	}
	public void setCasesHandled(int casesHandled) {
		this.casesHandled = casesHandled;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Doctor [Specialization=" + Specialization + ", experienceInYears=" + experienceInYears
				+ ", casesHandled=" + casesHandled + ", isAvailable=" + isAvailable + ", getPersonId()=" + getPersonId()
				+ ", getPassword()=" + getPassword() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + ", getContactNumber()=" + getContactNumber() + ", getDepartment()="
				+ getDepartment() + "]";
	}
	
	
}

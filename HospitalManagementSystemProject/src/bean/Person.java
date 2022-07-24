package bean;

public class Person {

	private int personId;
	private String password;
	private String Name;
	private int age;
	private String gender;
	private String contactNumber;
	private String Department;
	
	public Person() {
		super();
	}
	
	public Person( String password, String name, int age, String gender, String contactNumber,
			String department) {
		super();
//		this.personId = personId;
		this.password = password;
		Name = name;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		Department = department;
	}
	
	public Person(int personId, String password, String name, int age, String gender, String contactNumber,
			String department) {
		super();
		this.personId = personId;
		this.password = password;
		Name = name;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		Department = department;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", password=" + password + ", Name=" + Name + ", age=" + age
				+ ", gender=" + gender + ", contactNumber=" + contactNumber + ", Department=" + Department + "]";
	}
	
}

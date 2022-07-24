package presentation;

import java.util.Scanner;

import bean.Patient;
import service.DoctorServiceImpl;
import service.PatientServiceImpl;
import service.ValidateUserServiceImpl;

public class HospitalManagementPresentationImpl implements HospitalManagementPresentation {

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("============================Hospital Management System===================");
		System.out.println("1. Login/Register");
		System.out.println("2. Contact Us");
		System.out.println("3. To exit");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		performMenu(choice);

	}

	@Override
	public void performMenu(int choice) {

		Scanner sc = new Scanner(System.in);
		switch(choice) {
		
		case 1: 
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("3. Exit");
			int selection = sc.nextInt();
			signIn(selection);
			break;
		
		case 2:
			System.out.println("======= List of Doctors and their emergency Contact numbers ===============");
			DoctorServiceImpl doctorService = new DoctorServiceImpl();
			boolean isDone = doctorService.displayAvailableDoctors();
			if(!isDone) {
				System.out.println("Operation Failed");
			}
			break;
			
		case 3:
			System.out.println("======== Thank you for using our Hospital Management System ===============");
			System.exit(0);
			
			
		}
	}
	
	@Override
	public void signIn(int selection) {
		
		Scanner sc = new Scanner(System.in);
		
		switch(selection) {
		
		case 1:
			System.out.println("=========== Login Page ============");
			System.out.println("1. Login as a Doctor ");
			System.out.println("2. Login as a Patient ");
			System.out.println("3. Login as Admin ");
			System.out.println("4. Exit");
			
			int choice = sc.nextInt();
			
			logIn(choice);
			break;
		
		case 2:
			System.out.println("============= Register Page =============");
			System.out.println("Register as a Patient ");
			register();
			break;
		
		}
		
	}
	
	@Override
	public void logIn(int choice) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Patient id : ");
		int id = sc.nextInt();
		System.out.println("Enter password : ");
		String password = sc.nextLine();
		
		switch(choice) {
		
		case 1:
			
			ValidateUserServiceImpl user = new ValidateUserServiceImpl();
			
			boolean isCorrect = user.isPatient(id, password);
			if(!isCorrect) {
				System.out.println("Operation Failed");
				return;
			}
			System.out.println("Logged in successfully ============");
			PatientServiceImpl patientService = new PatientServiceImpl();
			
			System.out.println("1. Get patient profile");
			System.out.println("2. request Appointment");
			System.out.println("3. cancel Appointment Request");
			System.out.println("4. reschedule appointment ");
//		leaving here --- to be continued later
		}
		
	}
	
	@Override
	public void register() {
		Scanner sc = new Scanner(System.in);
		
//		Patient patient = new Patient();
		
		System.out.println("Enter Patient Name : ");
		String name = sc.nextLine();
		System.out.println("Enter patient age : ");
		int age = sc.nextInt();
		System.out.println("Enter patient gender : ");
		String gender = sc.next();
		System.out.println("Enter patient contactNumber : ");
		String contactNumber = sc.next();
		System.out.println("Enter patient department : ");
		String department = sc.next();
		System.out.println("Set password : ");
		String password = sc.nextLine();
		Patient patient = new Patient(password, name, age, gender, contactNumber, department);
		
		ValidateUserServiceImpl user = new ValidateUserServiceImpl();
		
		boolean isDone = user.registerPatient(patient);
		
		if(isDone) {
			System.out.println("User registered Successfully");
			int id = patient.getPersonId();
			System.out.println("Your patient Id is "+id+". Please note it down and keep it safe for future login purposes.");
			
		}else {
			System.out.println("Operation failed");
			System.out.println("Please try again.");
			return;
		}
	}

}

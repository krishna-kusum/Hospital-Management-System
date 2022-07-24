package persistance;

import bean.Patient;

public interface PatientDao {

//	boolean requestAppointment(); //isFlexible?
	
	boolean getPatientList();
	
	boolean getPatientDetails(int patientId);
	
	boolean addPatient(Patient patient);
	
	boolean removePatient(int patientId);
	
	boolean searchPatientId(String patientName);
}

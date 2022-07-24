package service;

import java.sql.Date;

public interface PatientService {

	boolean requestAppointment(int patientId,Date date);
	
	boolean cancelAppointmentRequest(int patientId);
	
	boolean rescheduleAppointment(int patientId, Date newDate);
	
	boolean getPatientProfile(int patientId); //can check only his/her patientHidtory
}

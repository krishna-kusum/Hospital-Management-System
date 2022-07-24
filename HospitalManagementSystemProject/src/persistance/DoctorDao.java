package persistance;

import java.util.List;
import java.util.Map;

import bean.Doctor;

public interface DoctorDao {

//	boolean getPatientProfile();
	
//	boolean editPatientProfile(Map<String,String> editList); //maybe use map, doctor can edit only certain sections
	
//	boolean getDoctorSchedule(int doctorId);
	
//	boolean updateSchedule(); //??
	
	boolean searchDoctorId(String doctorName);
	
	boolean getDoctorDetails(int doctorId);
	
	boolean getDoctorList();
	
	boolean addDoctor(Doctor doctor);
	
	boolean removeDoctor(int doctorId);
	
	boolean getEmergencyContact(int doctorId);
	
	List<String> getAvailableDoctors();
	
}

package persistance;

import java.util.Map;

public interface PatientHistoryDao { // maybe not required
	
	boolean getPatientHistory(int patientId);
	
	boolean editPatientHistory(int patientId, Map<String,String> patientHistory);
}

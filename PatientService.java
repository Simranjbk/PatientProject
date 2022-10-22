package FirstProject.AssingmentProject;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientService {
	
	@Autowired
	PatientDao patientDao;
	
	public ArrayList<Patient> getDataFromDB()
	{
		return patientDao.getDataFromDB();
		
	}

}

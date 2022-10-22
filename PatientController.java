package FirstProject.AssingmentProject;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@RequestMapping("AddPatient")
	public ArrayList<Patient> getPatient()
	{
	
		return patientService.getDataFromDB();
		
	}

}

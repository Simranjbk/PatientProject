package FirstProject.AssingmentProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Patient_Delete_Data {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("DeletePatient")
	public Patient getPatient(){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Patient patient= session.load(Patient.class,"Samir");
		System.out.println(patient);
		tx.commit();
		return patient;
		
	}

}

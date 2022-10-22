package FirstProject.AssingmentProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Patient_Insert_Data {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("InsertPatient")
	public Patient getpatient()
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		//Patient patient = new Patient("Sahil", "Faruk", "Sheikh", "20", "890789070", "Male", "B+", "Positive");
		Patient patient1 = new Patient("Samir", "Isak", "sheikh", "32", "890789000", "male", "A+","Pasitive");
		System.out.println(patient1);
		session.save(patient1);
		//tx.commit();
		return patient1;
		
	}
	

}

package FirstProject.AssingmentProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Patient_update_Data {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("UpdatePatient")
	public Patient getPatient()
	{
		System.out.println("SessionFactory>>" + sessionFactory);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Patient patient1 = new Patient("simran", "nasim", "sheikh", "25", "7898789098", "female", "B+", "positive");
		System.out.println(patient1);
		session.update(patient1);
		//tx.commit();
		return patient1;
	}
	
	

}

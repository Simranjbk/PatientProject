package FirstProject.AssingmentProject;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PatientDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public ArrayList<Patient> getDataFromDB()
	{
		Session session = sessionFactory.openSession();
		Criteria cri = session.createCriteria(Patient.class);
		ArrayList<Patient> p1 = (ArrayList<Patient>) cri.list();
		return p1;
		
	}

}

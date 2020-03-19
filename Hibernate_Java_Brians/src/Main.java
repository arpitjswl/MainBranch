import java.sql.SQLException;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arpit.hibernate.Address;
import com.arpit.hibernate.DemoIncrement;
import com.arpit.hibernate.UserDetails;

public class Main {

	public static void main(String[] args) {
		Session sess = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			
			sess = sf.openSession();
			sess.beginTransaction();
			
			DemoIncrement obj = new DemoIncrement();
			obj.setName("First");
			
			DemoIncrement obj2 = new DemoIncrement();
			obj2.setName("Second");
			
			Address address = new Address();
			address.setCity("Nagpur");
			address.setStreet("main road");
			address.setPIN("411033");
			address.setState("MP");
			
			obj.setAddress(address);
			
			UserDetails user = new UserDetails();
			user.setAddress("Delhi");
			user.setJoinedDate(new Date());
			user.setUserName("ASMI");
			
			UserDetails user2 = new UserDetails();
			user2.setUserName("Second User");
			
			Address address2 = new Address();
			address2.setCity("Pune");
			address2.setStreet("Elementa road");
			address2.setPIN("411022");
			address2.setState("Maharashtra");
			obj2.setAddress(address2);
			
			sess.save(user);
			sess.save(user2);
			sess.save(obj);
			sess.save(obj2);
			sess.getTransaction().commit();
			
			
			
			sess.close();
			
			
			
			
			
			sess = sf.openSession();
			sess.beginTransaction();
			
			
		//	sess.close();
		}
		catch (HibernateException e) {
			sess.getTransaction().rollback();
			e.printStackTrace();
		}
		
	}

}

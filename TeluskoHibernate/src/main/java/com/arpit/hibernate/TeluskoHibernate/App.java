package com.arpit.hibernate.TeluskoHibernate;

import javax.imageio.spi.ServiceRegistry;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
    {
        System.out.println( "Excec Starts" );
        Aliens ae = new Aliens();
        ae.setId(104);
        ae.setColor("Cyan");
        ae.setName("Jaggy");
        Address address = new Address();
        address.setArea("Tathwade");
        address.setPIN("411033");
        ae.setAddress(address);
        
//        ServiceRegistry ser = new ServiceRegistryBuilder().applySetting(new Configuration().getProperties()., value)
        SessionFactory sf = (SessionFactory) new Configuration().configure().addAnnotatedClass(Aliens.class).buildSessionFactory();
        Session sess = sf.openSession();
        sess.beginTransaction();
        
        sess.save(ae);
        sess.getTransaction().commit();
        sf.close();
        System.out.println(ae);
    }
}

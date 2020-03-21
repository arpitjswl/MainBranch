package com.hibernate.answers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.crud.SaveOrDelete;

public class AnswerDriver {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
	    Answer ans1=new Answer();    
	    ans1.setAnswername("Java is a programming language");    
	    ans1.setPostedBy("Ravi Malik");
	    
	        
	    Answer ans2=new Answer();    
	    ans2.setAnswername("Java is a platform");    
	    ans2.setPostedBy("Sudhir Kumar");    
	        
	    Answer ans3=new Answer();    
	    ans3.setAnswername("Servlet is an Interface");    
	    ans3.setPostedBy("Jai Kumar");    
	        
	    Answer ans4=new Answer();    
	    ans4.setAnswername("Servlet is an API");    
	    ans4.setPostedBy("Arun");    

	    Question question1=new Question();    
	    question1.setQname("What is Java?");
	    question1.getAnswers().add(ans1);
	    question1.getAnswers().add(ans2);
	    
	        
	        
	    Question question2=new Question();    
	    question2.setQname("What is Servlet?");    
	    question2.getAnswers().add(ans3)   ;
	    question2.getAnswers().add(ans4)   ;
	    
	        
	    sess.persist(question1);    
	    sess.persist(question2);  
		
		
		
	    sess.getTransaction().commit();
	    
	    org.hibernate.Query query = sess.createQuery("from Question");
	    List<Question> list= query.list();    
	      
	    Iterator<Question> itr=list.iterator();    
	    while(itr.hasNext()){    
	        Question q=itr.next();    
	        System.out.println("Question Name: "+q.getQname());    
	            
	        //printing answers    
	        List<Answer> list4=q.getAnswers();    
	        Iterator<Answer> itr2=list4.iterator();    
	       while(itr2.hasNext())  
	       {  
	        Answer a=itr2.next();  
	            System.out.println(a.getAnswername()+":"+a.getPostedBy());  
	        }    
	    }  
		
		sess.close();
		
		
		
		

	}

}

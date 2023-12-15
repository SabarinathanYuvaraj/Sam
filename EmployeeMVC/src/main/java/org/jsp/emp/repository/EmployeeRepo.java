package org.jsp.emp.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.jsp.emp.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {

	Configuration cfg =new Configuration().configure().addAnnotatedClass(Employee.class);
	SessionFactory sf=cfg.buildSessionFactory();
	
	public int addEmp(Employee e) {
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		int id=(int) ses.save(e);
		tr.commit();
		ses.close();
		
		return id;
	}

	public List<Employee> getAll() {
		Session ses=sf.openSession();
		CriteriaBuilder builder=ses.getCriteriaBuilder();
		CriteriaQuery<Employee> createQuery = builder.createQuery(Employee.class);
		Root<Employee> from = createQuery.from(Employee.class);
		Query<Employee> query = ses.createQuery(createQuery); 
		List<Employee> empList=query.getResultList();
		ses.close();
		return empList;
	}

	public void updateEmp(Employee e) {
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		 ses.update(e);
		 tr.commit();
		ses.close();
		
	}
	public List<Employee> getEmpById(int id) {
		Session ses=sf.openSession();
		List<Employee> al=new ArrayList<>();
		 al.add(ses.get(Employee.class, id));
		ses.close();
		return al;
	}

	public void deleteEmp(int id) {
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.delete(ses.get(Employee.class, id));
		tr.commit();
		ses.close();
		
	}

}

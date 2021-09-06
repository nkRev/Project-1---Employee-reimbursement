package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Reimbursement;
import utils.HibernateUtil;

public class ReimbursementImpl implements ReimbursementDAO{
	public Transaction transaction;
	public Session session;
	
	/**
	 * SHOULD BE CORRECT
	 */
	@Override
	public List<Reimbursement> getAllReimbursements() {
		
		session = HibernateUtil.getSessionFactory().openSession();
		
		transaction = session.beginTransaction();
		
		List<Reimbursement> reimbursements = session.createQuery("from reimbursements").getResultList();
		
		return reimbursements;
	}
	
	
	//POSSIBLY INCORRECT
	@Override
	public List<Reimbursement> getReimbursementByEmail(String email) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	//POSSIBLY INCORRECT
	@Override
	public List<Reimbursement> getReimbursementbyStatus(String status) {
		// TODO Auto-generated method stub
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		List<Reimbursement> rList;
		
		//not sure if this works
		rList = (List<Reimbursement>) session.get(Reimbursement.class, status);
		return rList;
	}

	//CREATES REIMBURSEMENT TICKET
	@Override
	public void createReimbursement(Reimbursement r) {
		// TODO Auto-generated method stub
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(r);
		transaction.commit();
		session.close();
	}

	//UPDATE REIMBURSEMENT TICKET
	@Override
	public void updateReimbursement(Reimbursement r) {
		// TODO Auto-generated method stub
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.update(r);
		transaction.commit();
		session.close();
	}


}

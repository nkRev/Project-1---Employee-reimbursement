package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Reimbursement;
import utils.HibernateUtil;

public class ReimbursementImpl implements ReimbursementDAO {
	public Transaction transaction;
	public Session session;

	/**
	 * SHOULD BE CORRECT
	 */
	@Override
	public List<Reimbursement> getAllReimbursements() {

		session = HibernateUtil.getSessionFactory().openSession();

		transaction = session.beginTransaction();

		List<Reimbursement> reimbursements = session.createQuery("from Reimbursement").getResultList();
		
		transaction.commit();

		return reimbursements;
	}


	// RETRIEVES A LIST OF REIMBURSEMENTS BY EMAIL
	@Override
	public List<Reimbursement> getReimbursementByEmail(String email) {
		// TODO Auto-generated method stub
		session = HibernateUtil.getSessionFactory().openSession();

		transaction = session.beginTransaction();

		final String hql = "from Reimbursement where email= :email";

		Query q = session.createQuery(hql);

		q.setParameter("email", email);

		List<Reimbursement> empReimbursements = q.getResultList();

		return empReimbursements;
	}

	// RETRIEVES A SINGLE REIMBURSEMENT BY Ticket ID
	@Override
	public Reimbursement getReimbursementsById(int id) {

		session = HibernateUtil.getSessionFactory().openSession();

		transaction = session.beginTransaction();

		final String hql = "from Reimbursement were ticket_id= :id";

		Query q = session.createQuery(hql);

		Reimbursement r = (Reimbursement) q.setParameter("id", id).getSingleResult();

		return r;

	}

	// RETRIEVES PENDING TICKETS
	@Override
	public List<Reimbursement> getPendingTickets() {
		// TODO Auto-generated method stub
		session = HibernateUtil.getSessionFactory().openSession();

		transaction = session.beginTransaction();

		final String hql = "from Reimbursement where status= :status";

		Query q = session.createQuery(hql);

		String status = "pending";

		q.setParameter("status", status);

		List<Reimbursement> rList = q.getResultList();

		return rList;
	}

	// CREATES REIMBURSEMENT TICKET
	@Override
	public void createReimbursement(Reimbursement r) {
		// TODO Auto-generated method stub
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(r);
		transaction.commit();
	
	}

	// UPDATE REIMBURSEMENT TICKET
	@Override
	public void updateReimbursement(Reimbursement r) {
		// TODO Auto-generated method stub
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.update(r);
		transaction.commit();

	}

}

package dao;

import java.util.List;

import model.Reimbursement;

public interface ReimbursementDAO {

	// get all reimbursements
	List<Reimbursement> getAllReimbursements();

	// get by email
	List<Reimbursement> getReimbursementByEmail(String email);
	
	//get by ticket id
	public Reimbursement getReimbursementsById(int id);

	// get Pending Tickets
	List<Reimbursement> getPendingTickets();

	// add reimbursement
	void createReimbursement(Reimbursement r);

	// update reimbursement
	void updateReimbursement(Reimbursement r);

}

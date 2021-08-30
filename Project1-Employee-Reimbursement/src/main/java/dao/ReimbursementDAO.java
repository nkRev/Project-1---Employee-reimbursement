package dao;

import java.util.List;

import model.Reimbursement;

public interface ReimbursementDAO {
	Reimbursement getReimbursementById();
	List<Reimbursement> getAllReimbursements();
	List<Reimbursement> getReimbursementById(int id);
	void createReimbursement(Reimbursement r);
	void updateReimbursement(Reimbursement r);
}

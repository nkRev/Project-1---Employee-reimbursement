package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reimbursements")
public class Reimbursement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reimbursement_id")
	private int reimbursementId;

	@Column(name = "submit_date")
	private Date reimbursementSubmit; // submit date

	// the date when you made the transaction
	@Column(name = "tx_date")
	private String transactionDate;

	// who you paid
	@Column(name = "paid_to")
	private String paidTo;

	// type of reimbursement -> medical, travel, etc
	@Column(name = "exepense_type")
	private String reimbursementType;

	@Column(name = "amount")
	private double reimbursementAmt;

	@Column(name = "status")
	private String reimbursementStatus; // status of reimbursement

	@Column(name = "resolved_date")
	private Date reimbursementResolved; // resolved date

	@Column(name = "user_id")
	private int userId;

	public Reimbursement() {
		super();
	}

	public Reimbursement(int reimbursementId, Date reimbursementSubmit, String transactionDate, String paidTo,
			String reimbursementType, double reimbursementAmt, String reimbursementStatus, Date reimbursementResolved,
			int userId) {
		super();
		this.reimbursementId = reimbursementId;
		this.reimbursementSubmit = reimbursementSubmit;
		this.transactionDate = transactionDate;
		this.paidTo = paidTo;
		this.reimbursementType = reimbursementType;
		this.reimbursementAmt = reimbursementAmt;
		this.reimbursementStatus = reimbursementStatus;
		this.reimbursementResolved = reimbursementResolved;
		this.userId = userId;
	}

	public int getReimbursementId() {
		return reimbursementId;
	}

	public void setReimbursementId(int reimbursementId) {
		this.reimbursementId = reimbursementId;
	}

	public Date getReimbursementSubmit() {
		return reimbursementSubmit;
	}

	public void setReimbursementSubmit(Date reimbursementSubmit) {
		this.reimbursementSubmit = reimbursementSubmit;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getPaidTo() {
		return paidTo;
	}

	public void setPaidTo(String paidTo) {
		this.paidTo = paidTo;
	}

	public String getReimbursementType() {
		return reimbursementType;
	}

	public void setReimbursementType(String reimbursementType) {
		this.reimbursementType = reimbursementType;
	}

	public double getReimbursementAmt() {
		return reimbursementAmt;
	}

	public void setReimbursementAmt(double reimbursementAmt) {
		this.reimbursementAmt = reimbursementAmt;
	}

	public String getReimbursementStatus() {
		return reimbursementStatus;
	}

	public void setReimbursementStatus(String reimbursementStatus) {
		this.reimbursementStatus = reimbursementStatus;
	}

	public Date getReimbursementResolved() {
		return reimbursementResolved;
	}

	public void setReimbursementResolved(Date reimbursementResolved) {
		this.reimbursementResolved = reimbursementResolved;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimbursementId=" + reimbursementId + ", reimbursementSubmit=" + reimbursementSubmit
				+ ", transactionDate=" + transactionDate + ", paidTo=" + paidTo + ", reimbursementType="
				+ reimbursementType + ", reimbursementAmt=" + reimbursementAmt + ", reimbursementStatus="
				+ reimbursementStatus + ", reimbursementResolved=" + reimbursementResolved + ", userId=" + userId + "]";
	}

	
	
}

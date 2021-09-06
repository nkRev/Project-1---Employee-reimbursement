package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "reimbursements")
public class Reimbursement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticket_id")
	private int reimbursementId;

	//ticket
	@Column(name = "submit_date")
	private Date submitDate; // submit date
	
	//ticket
	// type of reimbursement -> medical, travel, etc
	@Column(name = "reimbursement_type")
	private String reimbursementType;
	
	//ticket
	@Column(name = "dollar_amt")
	private double dollarAmt;
	
	//ticket
	//description 
	@Column(name = "description")
	private String description;
	
	//ticket
	@Column(name = "status")
	private String reimbursementStatus; // status of reimbursement

	//who it came from
	@Column(name = "email")
	private int email;

	public Reimbursement() {
		super();
	}

	public Reimbursement(int reimbursementId, Date submitDate, String reimbursementType, double dollarAmt,
			String description, String reimbursementStatus, int email) {
		super();
		this.reimbursementId = reimbursementId;
		this.submitDate = submitDate;
		this.reimbursementType = reimbursementType;
		this.dollarAmt = dollarAmt;
		this.description = description;
		this.reimbursementStatus = reimbursementStatus;
		this.email = email;
	}

	public int getReimbursementId() {
		return reimbursementId;
	}

	public void setReimbursementId(int reimbursementId) {
		this.reimbursementId = reimbursementId;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public String getReimbursementType() {
		return reimbursementType;
	}

	public void setReimbursementType(String reimbursementType) {
		this.reimbursementType = reimbursementType;
	}

	public double getDollarAmt() {
		return dollarAmt;
	}

	public void setDollarAmt(double dollarAmt) {
		this.dollarAmt = dollarAmt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReimbursementStatus() {
		return reimbursementStatus;
	}

	public void setReimbursementStatus(String reimbursementStatus) {
		this.reimbursementStatus = reimbursementStatus;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimbursementId=" + reimbursementId + ", submitDate=" + submitDate
				+ ", reimbursementType=" + reimbursementType + ", dollarAmt=" + dollarAmt + ", description="
				+ description + ", reimbursementStatus=" + reimbursementStatus + ", email=" + email + "]";
	}

	
}

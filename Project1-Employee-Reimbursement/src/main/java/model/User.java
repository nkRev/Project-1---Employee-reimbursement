package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userID;

	@Column(name = "firstName")
	private String fName;

	@Column(name = "lastName")
	private String lName;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private String role; //user roll admin || employee
	
	public User() {

	}

	public User(int userID, String fName, String lName, String email, String password, String role) {
		super();
		this.userID = userID;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", password="
				+ password + ", role=" + role + "]";
	}

	
	
	
}

package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.User;

public class UserDaoImpl implements UserDAO{
	private Transaction transaction;
	public static Session session;

	public UserDAOImpl() {
		
	}
	
	
	
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public User getUserById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByEmail() {
		// TODO Auto-generated method stub
		return null;
	}

}

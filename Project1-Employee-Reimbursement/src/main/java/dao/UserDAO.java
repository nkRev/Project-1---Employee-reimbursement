package dao;

import java.util.List;

import model.User;

public interface UserDAO {

	List<User> getAllUsers();

	User getUserById(int id);

	User getUserByEmail(String email);

}
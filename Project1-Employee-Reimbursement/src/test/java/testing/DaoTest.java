package testing;

import java.util.List;
import org.junit.Test;

import dao.UserDaoImpl;
import model.User;

public class DaoTest {

	@Test
	public void userTest() {

		UserDaoImpl udaoi = new UserDaoImpl();
		List<User> users = udaoi.getAllUsers();
		users.forEach(u -> System.out.println(u));

	}
}

package dao;

public class UserDAOFactory {
	private static UserDAO dao;

	private void UserDAOFactory() {

	}

	public static UserDAO getDao() {
		if (dao == null) {
			dao = new UserDaoImpl();
		}
		return dao;
	}
}

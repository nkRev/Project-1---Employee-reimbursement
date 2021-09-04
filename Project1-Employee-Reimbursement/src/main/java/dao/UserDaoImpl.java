package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.User;

import utils.HibernateUtil;

public class UserDaoImpl implements UserDAO {
	private Transaction transaction;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> users = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			users = session.createQuery("from users").getResultList();

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.printStackTrace();

		}

		return users;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub

		User u = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			u = session.get(User.class, id);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}
			e.printStackTrace();
		}

		return u;
	}

	@Override
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		User u = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			u = session.get(User.class, email);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}
		}

		return u;

	}

}

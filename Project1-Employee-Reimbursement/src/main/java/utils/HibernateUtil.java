package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf;

	private HibernateUtil() {

	}

	public static SessionFactory getSessionFactory() {

		if (sf == null) {

			try {

				// initialize configuration
				Configuration cfg = new Configuration();

				// configure
				cfg.configure();

				// create local SessionFactory
				sf = cfg.buildSessionFactory();

				// return session factory
				return sf;

			} catch (Exception e) {

				e.printStackTrace();

			}
		}

		return sf;
	}
}

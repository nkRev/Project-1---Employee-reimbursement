package utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import model.Reimbursement;
import model.User;

public class HibernateUtil {
	private static SessionFactory sf;

	public static SessionFactory getSessionFactory() {

		if (sf == null) {

			Configuration cfg = new Configuration();
			
			cfg.configure();
			
			sf = cfg.buildSessionFactory();
			
		
			return sf;
		}
		return sf;

	}
}

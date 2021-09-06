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

			Properties settings = new Properties();

			settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			settings.put(Environment.URL,
					"jdbc:mysql://project1.c7vqhiutvrem.us-west-2.rds.amazonaws.com:3306/employee");
			settings.put(Environment.USER, "admin");
			settings.put(Environment.PASS, "rootroot");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			settings.put(Environment.SHOW_SQL, "true");
			settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			settings.put(Environment.HBM2DDL_AUTO, "create-drop");

			cfg.setProperties(settings);
			cfg.addAnnotatedClass(User.class);
			cfg.addAnnotatedClass(Reimbursement.class);

			ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();

			System.out.println("Hibernate Java Cfg service registry created");

			sf = cfg.buildSessionFactory(sr);

		
			
			return sf;
		}
		return sf;

	}
}

package com;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateUtil {

	private static StandardServiceRegistry registry;
	private static SessionFactory sf;

	public static SessionFactory getSessionFactory() {
		if (sf == null) {
			// for hibernate connection
			Map<String, Object> map = new HashMap<String, Object>();
			map.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			map.put(Environment.URL, "jdbc:mysql://localhost:3307/advancejava14catche");
			map.put(Environment.USER, "root");
			map.put(Environment.PASS, "root");

			// hibernate config

			map.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			map.put(Environment.HBM2DDL_AUTO, "update");
			map.put(Environment.SHOW_SQL, true);
//			map.put(Environment.USE_SECOND_LEVEL_CACHE, "true");
//			map.put(Environment.CACHE_REGION_FACTORY, "true");
			

			registry = new StandardServiceRegistryBuilder().applySettings(map).build();
			MetadataSources mds = new MetadataSources(registry).addAnnotatedClass(Customer.class);
			Metadata md = mds.getMetadataBuilder().build();
			sf = md.getSessionFactoryBuilder().build();

		}
		return sf;

	}

}
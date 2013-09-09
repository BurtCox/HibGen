package com.hibgen;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Configuration configuration = new Configuration();
		configuration.configure("../../../properties/hibernate.cfg.xml");
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistryBuilder.buildServiceRegistry());
		sessionFactory.getCurrentSession();
	}

}

package com.tesis.ptspring.webController;


import org.hibernate.SessionFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

public class UserSessionController {
	
	public DriverManagerDataSource dataSource;
	public LocalSessionFactoryBean sessionFactory;
	public HibernateTransactionManager transactionManager;
	
	UserSessionController(){
		dataSource.setDriverClassName("");
		dataSource.setUrl("");
		dataSource.setUsername("");
		dataSource.setPassword("");
		
		sessionFactory.setDataSource(dataSource);
		
		sessionFactory.setConfigLocation(new ClassPathResource(""));
		
		transactionManager.setSessionFactory((SessionFactory) sessionFactory);
		
		
		
	}
	

}

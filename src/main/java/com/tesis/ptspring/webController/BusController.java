package com.tesis.ptspring.webController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tesis.ptspring.dao.BusDao;
import com.tesis.ptspring.daoImpl.BusDaoImpl;
import com.tesis.ptspring.modelEntities.Bus;

@Controller
@RequestMapping(value="/Unidades")
public class BusController {
	
	public DriverManagerDataSource dataSource;
	public LocalSessionFactoryBean sessionFactory;
	public HibernateTransactionManager transactionManager;
	
	@Autowired
    private BusDao busDao;
	
	@RequestMapping(value="/Unidades")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
		List<Bus> listBuses = busDao.getBuses();
		
		try {
			
			dataSource = new DriverManagerDataSource();
			
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/tesisdb");
			dataSource.setUsername("root");
			dataSource.setPassword("");
			
			sessionFactory = new LocalSessionFactoryBean();
			sessionFactory.setDataSource(dataSource);
			
			sessionFactory.setConfigLocation(new ClassPathResource("hibernate.cfg.xml"));
			
			transactionManager = new HibernateTransactionManager();
			transactionManager.setSessionFactory((SessionFactory) sessionFactory);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		
		ModelAndView model = new ModelAndView("indexBus");
		model.addObject("buses", listBuses);

        return model;
        
    }
	
	@RequestMapping(method = RequestMethod.POST)
	public String SaveBus(@ModelAttribute("busForm") Bus bus) {
		Bus model = new Bus();
		model.setPlaca(bus.getPlaca());
		model.setNumero(bus.getNumero());
		model.setFechaIngreso(bus.getFechaIngreso());
		model.setCapacidadTotal(bus.getCapacidadTotal());
		model.setCaracteristicas(bus.getCaracteristicas());
		
		busDao.saveBus(model);
		
		return "Save Sucessful";
	}
	
	
	
	
	
	
	

}

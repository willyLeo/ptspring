package com.tesis.ptspring.webController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tesis.ptspring.dao.IncidenciaDao;
import com.tesis.ptspring.modelEntities.Incidencia;

@Controller
public class IncidenciaController {
	
	@Autowired
	private IncidenciaDao incidenciaDao;
	
	
	@RequestMapping(value="/Incidencias")
	ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		List<Incidencia> listIncidencias = incidenciaDao.getIncidencias();
		
		ModelAndView model = new ModelAndView("indexIncidencia");
		model.addObject("buses", listIncidencias);
		
		return model;
	}

}

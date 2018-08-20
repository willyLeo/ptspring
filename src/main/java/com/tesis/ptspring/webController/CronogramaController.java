package com.tesis.ptspring.webController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tesis.ptspring.dao.CronogramaDao;
import com.tesis.ptspring.modelEntities.Cronograma;

@Controller
public class CronogramaController {
	
	@Autowired
	private CronogramaDao cronogramaDao;
	
	@RequestMapping(value="/Cronogramas")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		
		List<Cronograma> listCronogramas = cronogramaDao.getCronogramas();
		
		ModelAndView model = new ModelAndView("indexCronograma");
		model.addObject("cronogramas", listCronogramas);

        return model;
	}

}

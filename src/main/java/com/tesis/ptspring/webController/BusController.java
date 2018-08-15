package com.tesis.ptspring.webController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BusController {
	
	@RequestMapping(value="/Unidades")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){

        return new ModelAndView("indexBus");
    }
	
	@RequestMapping(value="/Unidades/Registrar")
    public ModelAndView bus(HttpServletRequest request, HttpServletResponse response){

        return new ModelAndView("formBus");
    }

}

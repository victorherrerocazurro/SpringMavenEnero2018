package com.ejemplo.springwebmvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ConfiguracionWeb implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		WebApplicationContext context = getContext();
		
		//Evita el web.xml
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet",
				new DispatcherServlet(context));
		
		dispatcher.setLoadOnStartup(1);
		
		dispatcher.addMapping("/");
	}

	private AnnotationConfigWebApplicationContext getContext() {
		//Evita el ApplicationContext.xml
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.setConfigLocation("com.ejemplo.springwebmvc.config");//Equivalente al component Scan
		return context;
	}

}

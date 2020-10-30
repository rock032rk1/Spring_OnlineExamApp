package com.onlineexam.app.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitialize /* extends AbstractAnnotationConfigDispatcherServletInitializer */implements WebApplicationInitializer {

//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		// TODO Auto-generated method stub
//		 return new Class[] { WebSecurityConfig.class };
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		// TODO Auto-generated method stub
//		 return new Class[] { WebConfig.class };
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		// TODO Auto-generated method stub
//		 return new String[] { "/" };
//	}

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(WebConfig.class);
		context.setServletContext(servletContext);

		ServletRegistration.Dynamic seDynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
		seDynamic.addMapping("/");
		seDynamic.setLoadOnStartup(1);

	}
	
	
}

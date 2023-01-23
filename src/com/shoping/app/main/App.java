package com.shoping.app.main;

import javax.servlet.ServletConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class App extends AbstractAnnotationConfigDispatcherServletInitializer{
	    static {
	        System.out.println("Initializer started....");
	    }

	 

	    @Override
	    protected Class<?>[] getRootConfigClasses() {

	        System.out.println();
	        return null;
	    }

	 

	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	    Class<?>[] classes = new Class[]{ServletConfig.class};
	        return classes;
	    }

	 

	    @Override
	    protected String[] getServletMappings() {
	    String[] mappings = new String[] {"/"};
	        return mappings;
	    }

	
	

}

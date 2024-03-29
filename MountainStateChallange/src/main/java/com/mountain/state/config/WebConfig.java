	package com.mountain.state.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/*
 * This class helps to give highest precedence to the index.html when it is loaded to the application server(tomcat server) 
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{

	  @Override
	    public void addViewControllers( ViewControllerRegistry registry ) {
	        registry.addViewController( "/" ).setViewName( "forward:/index.html" );
	        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
	        super.addViewControllers( registry );
	    }

}

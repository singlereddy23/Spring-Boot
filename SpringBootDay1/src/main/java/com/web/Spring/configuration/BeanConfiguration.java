package com.web.Spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class BeanConfiguration
{	
	@Bean
	public InternalResourceViewResolver setupResolver()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/webinfo/view/");
		resolver.setSuffix(".jsp");
		//resolver.setViewClass(JstlView.class);
		return resolver;
	}
}
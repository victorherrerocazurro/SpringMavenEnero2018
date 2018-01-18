package com.ejemplo.springwebmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ejemplo.springwebmvc.dto.Coche;

@Configuration
@EnableWebMvc
@ComponentScan("com.ejemplo.springwebmvc.controllers")
public class ConfiguracionSpringWeb {

	@Bean
	public String miString() {
		return new String("Victor");
	}
	
	@Bean
	public String otro() {
		return new String(miString());
	}
	
	@Bean
	public String mas() {
		return new String("otro" + miString());
	}
	
	@Bean
	public Coche coche() {
		return new Coche();
	}
	
}

package com.springmvctask;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan
@PropertySource("classpath:db.prop")
public class WebConfig implements WebMvcConfigurer {

	public WebConfig() {
		super();
	}

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/");

		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean
	public DataSource getDatasources() {
		System.out.println("Datasoures");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/login");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;

	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		System.out.println("Jdbc Template");
		return new JdbcTemplate(dataSource);

	}

}

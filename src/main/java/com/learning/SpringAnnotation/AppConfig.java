package com.learning.SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.SpringAnnotation.Model.EmployeeModel;

@Configuration
public class AppConfig {

	@Bean
	public EmployeeModel getEmployeeModel() {
		EmployeeModel model = new EmployeeModel();
		model.seteName("Venkat");
		model.seteAge(40);
		return model;
	}
}

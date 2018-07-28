package com.learning.SpringAnnotation.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanClass {

	@Bean
	public EmployeeModel details() {
		EmployeeModel model = new EmployeeModel();
		model.seteName("Tarun");
		model.seteAge(26);
		model.seteId(101);
		model.seteSalary(10000);
		return model;
	}

	@Bean
	public AdressModel addDetails() {
		// return new AdressModel() ;

		AdressModel ad = new AdressModel();
		ad.setStreet("13-22-23 V.V Nagar");
		ad.setCity("Hyd");
		ad.setHouseNo(137);
		ad.setState("Telengana");
		ad.setCountry("India");
		return ad;
	}
}

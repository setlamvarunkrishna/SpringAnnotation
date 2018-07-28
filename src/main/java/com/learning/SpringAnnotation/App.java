package com.learning.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.SpringAnnotation.Model.BeanClass;
import com.learning.SpringAnnotation.Model.EmployeeModel;

public class App {
	public static void main(String[] args) {

		// in xml we use ClassPathXMLApplicationContext(-- we mention xml
		// file)--
		// in Annotations we use AnnotationConfigApplicationContext(-- we
		// mention config file )---
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanClass.class);
		EmployeeModel EM = (EmployeeModel) context.getBean(EmployeeModel.class);

		System.out.println(EM.toString());
	}
}

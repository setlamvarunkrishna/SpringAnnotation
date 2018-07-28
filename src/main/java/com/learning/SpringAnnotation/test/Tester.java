package com.learning.SpringAnnotation.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.SpringAnnotation.Model.EmployeeModel;

@Component
public class Tester {

	@Autowired
	private EmployeeModel model;
}

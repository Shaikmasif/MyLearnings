package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.dao.StudentDao;
import com.springmvc.model.Student;
@Component
public class RegistrationService {
	
	@Autowired
	private StudentDao studentDaoImpl;
	
	public int saveUser(Student s) {
		return studentDaoImpl.insert(s);
	}
	

}

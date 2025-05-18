package com.springmvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.springmvc.model.Student;
@Component
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int insert(Student s) {
		// TODO Auto-generated method stub
		int r = (Integer)this.hibernateTemplate.save(s);
		return r;
	}

}

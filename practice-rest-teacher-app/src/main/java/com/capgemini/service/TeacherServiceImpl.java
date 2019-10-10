package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dao.TeacherDao;
import com.capgemini.model.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherDao teacherDao;

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
	@Transactional
	@Override
	
	public int addTeacher(Teacher teacher) {
		return teacherDao.insertTeacher(teacher);
	}

	@Override
	public List<Teacher> viewAllTeacher() {
		return teacherDao.selectAllTeacher();
	}

	@Override
	public Teacher viewTeacherById(int teacherId) {
		return teacherDao.selectTeacherById(teacherId);
	}

}

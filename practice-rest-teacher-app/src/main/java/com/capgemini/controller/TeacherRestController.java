package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Teacher;
import com.capgemini.service.TeacherService;

@RestController
@RequestMapping("teacher")
public class TeacherRestController {
	@Autowired
	TeacherService teacherService;
	@RequestMapping(path="add", method= RequestMethod.POST)
	public List<Teacher> addTeacher(@RequestBody Teacher teacher) {
		 teacherService.addTeacher(teacher);
		List<Teacher> listTeacher=teacherService.viewAllTeacher();
		return listTeacher;
	}
	@RequestMapping(path="view/{teacherId}", method=RequestMethod.GET)
	public Teacher viewById(@PathVariable("teacherId") int teacherId) {
		return teacherService.viewTeacherById(teacherId);
	}
	@RequestMapping(path="viewAll", method=RequestMethod.GET)
	public List<Teacher> viewAll(){
		return teacherService.viewAllTeacher();
	}

}

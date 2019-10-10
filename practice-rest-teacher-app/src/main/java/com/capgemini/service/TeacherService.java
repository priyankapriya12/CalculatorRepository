package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Teacher;

public interface TeacherService {
 public int addTeacher(Teacher teacher);
 public List<Teacher> viewAllTeacher();
 public Teacher viewTeacherById(int teacherId);
}

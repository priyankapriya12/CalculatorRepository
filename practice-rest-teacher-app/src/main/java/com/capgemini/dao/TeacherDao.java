package com.capgemini.dao;

import java.util.List;

import com.capgemini.model.Teacher;

public interface TeacherDao {
public int insertTeacher(Teacher teacher);
public List<Teacher> selectAllTeacher();
public Teacher selectTeacherById(int teacherId);
}

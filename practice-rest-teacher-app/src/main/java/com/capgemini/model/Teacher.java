package com.capgemini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TEACHER")
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Teacher_Id_Generator") //for automatic generation of primary key
	@SequenceGenerator(sequenceName="TEACHER_SEQ", name="Teacher_Id_Generator",allocationSize=1)
	@Column(name="teacher_id")
	private int teacherId;
	@Column(name="teacher_name")
	private String teacherName;
	@Column(name="teacher_department")
	private String teacherDepartment;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherDepartment() {
		return teacherDepartment;
	}
	public void setTeacherDepartment(String teacherDepartment) {
		this.teacherDepartment = teacherDepartment;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherDepartment="
				+ teacherDepartment + "]";
	}
	

}

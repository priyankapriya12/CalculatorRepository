package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.model.Teacher;

@Repository
public class TeacherDaoImpl implements TeacherDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public int insertTeacher(Teacher teacher) {
		entityManager.persist(teacher);
		return 1;
	}

	@Override
	public List<Teacher> selectAllTeacher() {
		TypedQuery<Teacher> tQuery = entityManager.createQuery("From Teacher", Teacher.class);
		return tQuery.getResultList();

	}

	@Override
	public Teacher selectTeacherById(int teacherId) {
		return entityManager.find(Teacher.class, teacherId);
		//Query query = entityManager.createQuery("From Teacher t where t.teacherId=:tid");
		//query.setParameter("tid", teacherId);
	}

}

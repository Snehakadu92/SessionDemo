package com.zensar.dao;

import java.util.List;

import com.zensar.model.Student;

public class StudentDaoImplement implements StudentDao {
    
	private static final String INSERT_STUDENT_SQL ="insert into student(name ,qualification)";
	private static final String SELECT_STUDENT_BY_ID ="select * from student where id=?";
	private static final String SELECT_ALL_STUDENTS="select * from student";
	private static final String DELETE_STUDENT_SQL="delete from student where id =?";
	private static final String UPDATE_STUDENT_SQL ="update student set name =?,qualification=?";	

  public Student getStudent(int id) {
	  Student sobj=null;
	  try {Connection connection=DB
  }
	
//	public Student getStudent(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
// 
//	public List<Student> getAllStudents() {
//		// TODO Auto-generated method stub
//		return null;
//	}
// 
//	public boolean insertStudent(Student student) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean updateStudent(Student s) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean deleteStudent(int id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//}

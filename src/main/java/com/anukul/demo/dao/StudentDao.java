package com.anukul.demo.dao;

import com.anukul.demo.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {

    void insertNewStudent(UUID studentId, Student student);

    Student selectStudentById(UUID studentId);

    List<Student> selectAllStudents();

    int updateStudentById(UUID studentOd, Student newStudent);

    int deleteStudentId(UUID studentId);

}

package com.anukul.demo.service;

import com.anukul.demo.dao.StudentDao;
import com.anukul.demo.model.Student;

import java.util.List;
import java.util.UUID;

public class StudentService {

    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }


    public int persistNewStudent(UUID studentId, Student student){
        UUID studentUId = studentId==null? UUID.randomUUID():studentId;
        return  studentDao.insertNewStudent(studentUId, student);
    }

    public Student getStudentById(UUID studentId){
        return studentDao.selectStudentById(studentId);
    }

    public List<Student> getAllStudents(){
        return studentDao.selectAllStudents();
    }

    public int updateStudentById(UUID studentId, Student studentUpdate){
        return studentDao.updateStudentById(studentId,studentUpdate);
    }

    public int deleteStudentId(UUID studentId){
       return studentDao.deleteStudentId(studentId);
    }
}

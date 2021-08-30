package com.anukul.demo.service;

import com.anukul.demo.dao.StudentDao;
import com.anukul.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    private final StudentDao studentDao;

    @Autowired
    public StudentService(@Qualifier("fakeDao") StudentDao studentDao) {
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

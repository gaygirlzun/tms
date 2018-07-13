package com.briup.touhou.service;
import java.util.List;
import com.briup.touhou.bean.Student;
public interface IStudentService {
 List<Student> findAll() throws Exception;
 Student findById(long id)throws Exception;
 void  update(Student student)throws Exception;
 void  save(Student student)throws Exception;
 void deleteById(long id)throws Exception;
 
}

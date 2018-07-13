package com.briup.touhou.Dao;
import java.util.List;
import com.briup.touhou.bean.Student;

public interface StudentMapper {
       List<Student> findAll();
       Student findById(long id);
       void save(Student student);
       void update(Student student);
       void deleteById(long id);
}

package com.briup.touhou.service.Impl;

import java.util.List;
import com.briup.touhou.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.touhou.bean.Student;
import com.briup.touhou.Dao.StudentMapper;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> findAll() throws Exception {
		List<Student> list = studentMapper.findAll();
		return list;
	}

	@Override
	public Student findById(long id) throws Exception {
		return studentMapper.findById(id);
	}
	@Override
	public void save(Student student) throws Exception {
		studentMapper.save(student);
	}

	@Override
	public void update(Student student) throws Exception {
		studentMapper.update(student);
	}

	@Override
	public void deleteById(long id) throws Exception {
		Student student = studentMapper.findById(id);
		if (student != null) {
			studentMapper.deleteById(id);
		} else {
			throw new Exception("要删除的学生不存在");
		}
	}
}

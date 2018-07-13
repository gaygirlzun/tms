package com.briup.touhou.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.briup.touhou.bean.Student;
import com.briup.touhou.service.IStudentService;
import com.briup.touhou.util.MsgResponse;

@RestController
@RequestMapping("/test")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	@GetMapping("deleStudentById")
	public MsgResponse deleteStudentById(long id) {
		try {
			studentService.deleteById(id);
			return MsgResponse.success("删除成功！", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());

		}
	}

	@PostMapping("updateStudent")
	public String updateStudent(Student student) {
		try {
			studentService.update(student);
			return "xiugaichenggong";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();

		}
	}

	@PostMapping("saveStudent")
	public void saveStudent(Student student) {
		try {
			studentService.save(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@GetMapping("findAllStudent")
	public MsgResponse findAllStudent(){
		try {
			List<Student> list = studentService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("findStudentById")
	public Student findStudentById(long id) {
		try {
			Student student = studentService.findById(id);
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

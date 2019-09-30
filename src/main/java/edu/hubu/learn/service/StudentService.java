package edu.hubu.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.StudentDao;
import edu.hubu.learn.entity.Student;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Student getUser(Long id) {
        return studentDao.findById(id).get();
    }

	public List<Student> getStudent(Long id) {
		return null;
	}

	public List<Student> getStudents() {
		return null;
	}
}
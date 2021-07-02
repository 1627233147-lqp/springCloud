package com.panshi.it.service.impl;

import com.panshi.it.bean.Student;
import com.panshi.it.mapper.StudentMapper;
import com.panshi.it.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
  @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> findStu() {
        return studentMapper.findStu();
    }

  @Override
  public  void addStu(Student student) {
      studentMapper.addStu(student);
  }

    @Override
    public void delStu(int id) {
        studentMapper.delStu(id);
    }

    @Override
    public void updateStu(Student student) {
        studentMapper.updateStu(student);
    }
}

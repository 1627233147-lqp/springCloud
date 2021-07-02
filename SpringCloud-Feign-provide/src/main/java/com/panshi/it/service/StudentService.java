package com.panshi.it.service;

import com.panshi.it.bean.Student;

import java.util.List;

public interface StudentService {
    List<Student> findStu();
   void  addStu(Student student);
    void delStu(int id);
    void updateStu(Student student);
}

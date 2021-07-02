package com.panshi.it.controller;

import com.panshi.it.bean.Student;
import com.panshi.it.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/findStu")
    @ResponseBody
    public List<Student> findStu(){
        List<Student> list =studentService.findStu();
        return list;
    }
     @RequestMapping("/addStu")
      @ResponseBody
    public void addStu(Student student){
        studentService.addStu(student);
    }
    @RequestMapping("/delStu")
    @ResponseBody
    public void delStu(int id){
        studentService.delStu(id);
    }
}

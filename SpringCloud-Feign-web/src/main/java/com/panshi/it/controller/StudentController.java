package com.panshi.it.controller;

import com.panshi.it.bean.Student;
import com.panshi.it.feign.StudentFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
public class StudentController {
    @Autowired
    private StudentFeignClient studentFeignClient;
    @RequestMapping("/web-find/findStu")
    public String findStu(Model model){
        List<Student> studentList = studentFeignClient.finStu();
        model.addAttribute("studentlist",studentList);
        return "Student";
    }
}

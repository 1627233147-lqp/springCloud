package com.panshi.it.service.impl;

import com.panshi.it.bean.Student;
import com.panshi.it.feign.StudentFeignClient;
import com.panshi.it.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class IStudentServiceImpl implements IStudentService {

    @Override
    public List<Student> findStudent() {
        return null;
    }
}

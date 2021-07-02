package com.panshi.it.feign;

import com.panshi.it.bean.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentFeignClientFallback implements StudentFeignClient {
    @Override
    public List<Student> finStu() {
        List<Student> stuList = new ArrayList<Student>();
        Student stu = new Student();
        stu.setStuId(-1);
        stu.setStuName("服务熔断");
        stuList.add(stu);
        return stuList;
    }
}

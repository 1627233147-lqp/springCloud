package com.panshi.it.feign;

import com.panshi.it.bean.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// student-service 对应的是提供者项目spring.application.name=provide-service
@FeignClient(value = "provide-service",fallback = StudentFeignClientFallback.class)
public interface StudentFeignClient {
   @RequestMapping("/findStu")
    public List<Student> finStu();
}

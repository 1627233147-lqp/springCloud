package com.panshi.it.mapper;

import com.panshi.it.bean.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> findStu();
    @Insert("insert into student values(stu_id,#{stuName},#{stuAge},#{stuSex},#{stuFamily})")
     void addStu(Student student);
    @Delete("delete from student where stu_id=#{stuId}")
    void delStu(int id);
    @Update("update student set stu_name=#{stuName},stu_age=#{stuAge},stu_sex=#{stuSex},stu_family=#{stuFamily}")
     void updateStu(Student student);
}

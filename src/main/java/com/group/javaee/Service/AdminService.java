package com.group.javaee.Service;

import com.group.javaee.Mapper.AdminMapper;
import com.group.javaee.Pojo.Course;
import com.group.javaee.Pojo.Student;
import com.group.javaee.Pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired(required = false)
    private AdminMapper adminMapper;
    //--    插入课程信息
     public String InsertCourse(Course course){
         int result=adminMapper.InsertCourse(course);
         if (result==1){
             return "插入课程信息成功";
         }
         else {
             return "插入课程信息失败";
         }
     }

     //--  插入老师信息
     public  String InsertTeacher(Teacher teacher){
         int result=adminMapper.InsertTeacher(teacher);
         if(result==1){
             return "插入老师信息成功";
         }
         else{
             return "插入老师信息失败";
         }
     }

     //--  更改学生信息
    public String UpdateStudent(Student student){
         int result=adminMapper.UpdateStudent(student);
         if(result==1){
             return "修改学生信息成功";
         }
         else{
             return "修改学生信息失败";
         }
    }
}

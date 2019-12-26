package com.group.javaee.Controller;


import com.group.javaee.Pojo.Course;
import com.group.javaee.Pojo.Student;
import com.group.javaee.Pojo.Teacher;
import com.group.javaee.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController {
@Autowired
AdminService adminService;

    //--  插入课程信息
    @RequestMapping("adminInsertCourse")
    public String InsertCourse(Course course){
    String result=adminService.InsertCourse(course);//--  result=成功 或 失败
    return result;//--  返回给admin-result网页输出结果
        //--  已验证可用
}

    //--  插入老师信息
    @RequestMapping("adminInsertTeacher")
    public String InsertTeacher(Teacher teacher){
    String result=adminService.InsertTeacher(teacher);
    return result;
    }
        //-- 以验证可用

    //--  修改学生信息
    @RequestMapping("adminUpdateStudent")
    public String UpdateStudent(Student student){
    String result=adminService.UpdateStudent(student);
    return result;
    }
    //-- 以验证可用
}

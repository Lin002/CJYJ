package com.group.javaee.Mapper;

import com.group.javaee.Pojo.Course;
import com.group.javaee.Pojo.Student;
import com.group.javaee.Pojo.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AdminMapper {
    //--  插入课程信息
    @Insert("INSERT INTO course(courseId,courseName,method) VALUES(#{courseId},#{courseName},#{method})")
    int InsertCourse(Course course);

    //--   插入老师信息
    @Insert("INSERT INTO teacher(teacherId,teacherName,teacherEmail,teacherTel) VALUES(#{teacherId},#{teacherName},#{teacherEmail},#{teacherTel})")
    int InsertTeacher(Teacher teacher);

    //--  修改学生信息
    @Update("UPDATE student set studentPassword=#{studentPassword},studentName=#{studentName},studentClass=#{studentClass},studentEmail=#{studentEmail},studentTel=#{studentTel},studentOrigin=#{studentOrigin} WHERE studentId=#{studentId}")
    int UpdateStudent(Student student);


}


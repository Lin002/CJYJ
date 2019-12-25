package com.group.javaee.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    @Insert("INSERT INTO course(courseId,courseName,method) VALUES(#{courseId},#{courseName},#{method})")
}

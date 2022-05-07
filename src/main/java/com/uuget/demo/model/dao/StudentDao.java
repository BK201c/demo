package com.uuget.demo.model.dao;

import com.uuget.demo.model.entity.Student;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * student数据库访问层
 */
@Mapper
@Repository
public interface StudentDao {

  /**
   * 通过id查询单条数据
   * 
   * @param id 主键
   * @return student 实例对象
   */
  Student getById(Integer id);

  /**
   * 查询
   */
}

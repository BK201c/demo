package com.uuget.demo.controller;

import com.uuget.demo.model.entity.Student;
import com.uuget.demo.service.impl.StudentServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * student表控制层
 * 
 */
@RestController
@RequestMapping("/student")
public class StudentController {

  @Resource
  private StudentServiceImpl studentServiceImpl;

  @GetMapping("/getById")
  public Student getById(Integer id) {
    return this.studentServiceImpl.getById(id);
  }
}
